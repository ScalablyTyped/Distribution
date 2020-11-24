package typings.maquette.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mapping[Source, Target] extends js.Object {
  
  /**
    * Maps a new array of sources and updates [[results]].
    *
    * @param newSources   The new array of sources.
    */
  def map(newSources: js.Array[Source]): Unit = js.native
  
  /**
    * The array of results. These results will be synchronized with the latest array of sources that were provided using [[map]].
    */
  var results: js.Array[Target] = js.native
}
object Mapping {
  
  @scala.inline
  def apply[Source, Target](map: js.Array[Source] => Unit, results: js.Array[Target]): Mapping[Source, Target] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping[Source, Target]]
  }
  
  @scala.inline
  implicit class MappingOps[Self <: Mapping[_, _], Source, Target] (val x: Self with (Mapping[Source, Target])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMap(value: js.Array[Source] => Unit): Self = this.set("map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResultsVarargs(value: Target*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[Target]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
