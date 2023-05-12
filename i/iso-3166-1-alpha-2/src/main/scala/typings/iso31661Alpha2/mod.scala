package typings.iso31661Alpha2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iso-3166-1-alpha-2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCode(country: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCode")(country.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getCodes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodes")().asInstanceOf[js.Array[String]]
  
  inline def getCountries(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")().asInstanceOf[js.Array[String]]
  
  inline def getCountry(code: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")(code.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getData(): StringDictionary[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")().asInstanceOf[StringDictionary[js.UndefOr[String]]]
}
