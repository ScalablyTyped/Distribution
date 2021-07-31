package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Xcode version that an iOS version is compatible with.
  */
trait SchemaXcodeVersion extends StObject {
  
  /**
    * Tags for this Xcode version. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The id for this version. Example: &quot;9.2&quot;.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SchemaXcodeVersion {
  
  @scala.inline
  def apply(): SchemaXcodeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaXcodeVersion]
  }
  
  @scala.inline
  implicit class SchemaXcodeVersionMutableBuilder[Self <: SchemaXcodeVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
