package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines sources for the suggest/search APIs.
  */
trait SchemaSource extends StObject {
  
  /**
    * Source name for content indexed by the Indexing API.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Predefined content source for Google Apps.
    */
  var predefinedSource: js.UndefOr[String] = js.undefined
}
object SchemaSource {
  
  inline def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  extension [Self <: SchemaSource](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPredefinedSource(value: String): Self = StObject.set(x, "predefinedSource", value.asInstanceOf[js.Any])
    
    inline def setPredefinedSourceUndefined: Self = StObject.set(x, "predefinedSource", js.undefined)
  }
}
