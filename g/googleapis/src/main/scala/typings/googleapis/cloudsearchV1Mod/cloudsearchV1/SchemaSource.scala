package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines sources for the suggest/search APIs.
  */
@js.native
trait SchemaSource extends StObject {
  
  /**
    * Source name for content indexed by the Indexing API.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Predefined content source for Google Apps.
    */
  var predefinedSource: js.UndefOr[String] = js.native
}
object SchemaSource {
  
  @scala.inline
  def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  @scala.inline
  implicit class SchemaSourceMutableBuilder[Self <: SchemaSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPredefinedSource(value: String): Self = StObject.set(x, "predefinedSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedSourceUndefined: Self = StObject.set(x, "predefinedSource", js.undefined)
  }
}
