package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic metadata about a counter.
  */
@js.native
trait SchemaNameAndKind extends js.Object {
  
  /**
    * Counter aggregation kind.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the counter.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaNameAndKind {
  
  @scala.inline
  def apply(): SchemaNameAndKind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNameAndKind]
  }
  
  @scala.inline
  implicit class SchemaNameAndKindOps[Self <: SchemaNameAndKind] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
