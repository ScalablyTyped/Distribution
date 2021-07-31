package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Drive item which is a folder.
  */
trait SchemaFolder extends StObject {
  
  /**
    * The type of Drive folder.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaFolder {
  
  @scala.inline
  def apply(): SchemaFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolder]
  }
  
  @scala.inline
  implicit class SchemaFolderMutableBuilder[Self <: SchemaFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
