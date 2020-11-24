package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instance rotate server CA context.
  */
@js.native
trait SchemaRotateServerCaContext extends js.Object {
  
  /**
    * This is always sql#rotateServerCaContext.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The fingerprint of the next version to be rotated to. If left
    * unspecified, will be rotated to the most recently added server CA
    * version.
    */
  var nextVersion: js.UndefOr[String] = js.native
}
object SchemaRotateServerCaContext {
  
  @scala.inline
  def apply(): SchemaRotateServerCaContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRotateServerCaContext]
  }
  
  @scala.inline
  implicit class SchemaRotateServerCaContextOps[Self <: SchemaRotateServerCaContext] (val x: Self) extends AnyVal {
    
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
    def setNextVersion(value: String): Self = this.set("nextVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextVersion: Self = this.set("nextVersion", js.undefined)
  }
}
