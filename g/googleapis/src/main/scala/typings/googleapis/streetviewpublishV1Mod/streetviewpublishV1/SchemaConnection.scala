package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A connection is the link from a source photo to a destination photo.
  */
trait SchemaConnection extends StObject {
  
  /**
    * Required. The destination of the connection from the containing photo to
    * another photo.
    */
  var target: js.UndefOr[SchemaPhotoId] = js.undefined
}
object SchemaConnection {
  
  @scala.inline
  def apply(): SchemaConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnection]
  }
  
  @scala.inline
  implicit class SchemaConnectionMutableBuilder[Self <: SchemaConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: SchemaPhotoId): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
