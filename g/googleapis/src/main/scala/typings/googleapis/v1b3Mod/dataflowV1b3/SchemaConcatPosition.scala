package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A position that encapsulates an inner position and an index for the inner
  * position. A ConcatPosition can be used by a reader of a source that
  * encapsulates a set of other sources.
  */
@js.native
trait SchemaConcatPosition extends js.Object {
  
  /**
    * Index of the inner source.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Position within the inner source.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
}
object SchemaConcatPosition {
  
  @scala.inline
  def apply(): SchemaConcatPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConcatPosition]
  }
  
  @scala.inline
  implicit class SchemaConcatPositionOps[Self <: SchemaConcatPosition] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setPosition(value: SchemaPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
