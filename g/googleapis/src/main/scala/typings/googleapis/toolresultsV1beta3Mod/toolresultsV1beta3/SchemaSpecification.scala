package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The details about how to run the execution.
  */
trait SchemaSpecification extends StObject {
  
  /**
    * An Android mobile test execution specification.
    */
  var androidTest: js.UndefOr[SchemaAndroidTest] = js.undefined
}
object SchemaSpecification {
  
  inline def apply(): SchemaSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpecification]
  }
  
  extension [Self <: SchemaSpecification](x: Self) {
    
    inline def setAndroidTest(value: SchemaAndroidTest): Self = StObject.set(x, "androidTest", value.asInstanceOf[js.Any])
    
    inline def setAndroidTestUndefined: Self = StObject.set(x, "androidTest", js.undefined)
  }
}
