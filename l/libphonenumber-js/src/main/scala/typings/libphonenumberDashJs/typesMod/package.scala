package typings.libphonenumberDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  import org.scalablytyped.runtime.StringDictionary

  type CarrierCode = String
  type Countries = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ country in libphonenumber-js.libphonenumber-js/types.CountryCode ]: std.Array<any>}
    */ typings.libphonenumberDashJs.libphonenumberDashJsStrings.Countries with js.Any
  type CountryCallingCode = String
  type CountryCallingCodes = StringDictionary[js.Array[CountryCode]]
  type E164Number = String
  type Extension = String
  type FormatExtension = js.Function3[
    /* formattedNumber */ String, 
    /* extension */ Extension, 
    /* metadata */ Metadata, 
    String
  ]
  type NationalNumber = String
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.PREMIUM_RATE
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.TOLL_FREE
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.SHARED_COST
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.VOIP
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.PERSONAL_NUMBER
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.PAGER
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.UAN
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.VOICEMAIL
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.FIXED_LINE_OR_MOBILE
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.FIXED_LINE
    - typings.libphonenumberDashJs.libphonenumberDashJsStrings.MOBILE
  */
  type NumberType = js.UndefOr[_NumberType]
}
