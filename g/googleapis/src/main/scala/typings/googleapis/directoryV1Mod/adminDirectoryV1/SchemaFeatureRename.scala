package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template for renaming a feature.
  */
trait SchemaFeatureRename extends StObject {
  
  /**
    * New name of the feature.
    */
  var newName: js.UndefOr[String] = js.undefined
}
object SchemaFeatureRename {
  
  @scala.inline
  def apply(): SchemaFeatureRename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureRename]
  }
  
  @scala.inline
  implicit class SchemaFeatureRenameMutableBuilder[Self <: SchemaFeatureRename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewNameUndefined: Self = StObject.set(x, "newName", js.undefined)
  }
}
