package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.baseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.baseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.baseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.NoArgMethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.WithResponse
import typings.mangopay2NodejsSdk.countryAuthorizationMod.countryAuthorization.CountryAuthorizationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regulatoryMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Regulatory", "Regulatory")
  @js.native
  open class Regulatory () extends StObject {
    
    /**
      * View the restrictions for al countries
      */
    def getAllCountriesAuthorizations(): js.Promise[js.Array[CountryAuthorizationData]] = js.native
    /**
      * View the restrictions for al countries
      */
    def getAllCountriesAuthorizations(
      callback: js.Function1[
          (/* data */ js.Array[CountryAuthorizationData]) | (/* data */ WithResponse[js.Array[CountryAuthorizationData]]), 
          Unit
        ]
    ): Unit = js.native
    def getAllCountriesAuthorizations(
      callback: js.Function1[/* data */ WithResponse[js.Array[CountryAuthorizationData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getAllCountriesAuthorizations(
      callback: js.Function1[/* data */ js.Array[CountryAuthorizationData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * View the restrictions for al countries
      */
    def getAllCountriesAuthorizations(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[CountryAuthorizationData]]] = js.native
    def getAllCountriesAuthorizations(options: MethodOptionWithoutResponse): js.Promise[js.Array[CountryAuthorizationData]] = js.native
    /**
      * View the restrictions for al countries
      */
    @JSName("getAllCountriesAuthorizations")
    var getAllCountriesAuthorizations_Original: NoArgMethodOverload[js.Array[CountryAuthorizationData]] = js.native
    
    /**
      * View the restrictions for a specific country
      * @param countryCode: the code of the Country
      */
    def getCountryAuthorizations(data: String): js.Promise[CountryAuthorizationData] = js.native
    /**
      * View the restrictions for a specific country
      * @param countryCode: the code of the Country
      */
    def getCountryAuthorizations(data: String, callback: js.Function1[/* data */ CountryAuthorizationData, Unit]): Unit = js.native
    /**
      * View the restrictions for a specific country
      * @param countryCode: the code of the Country
      */
    def getCountryAuthorizations(
      data: String,
      callback: js.Function1[/* data */ WithResponse[CountryAuthorizationData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getCountryAuthorizations(
      data: String,
      callback: js.Function1[/* data */ CountryAuthorizationData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * View the restrictions for a specific country
      * @param countryCode: the code of the Country
      */
    def getCountryAuthorizations(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[CountryAuthorizationData]] = js.native
    def getCountryAuthorizations(data: String, options: MethodOptionWithoutResponse): js.Promise[CountryAuthorizationData] = js.native
    /**
      * View the restrictions for a specific country
      * @param countryCode: the code of the Country
      */
    @JSName("getCountryAuthorizations")
    var getCountryAuthorizations_Original: MethodOverload[String, CountryAuthorizationData] = js.native
  }
}
