package typings.libphonenumberJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CarrierCode = java.lang.String
  type CountryCallingCode = java.lang.String
  type CountryCallingCodes = org.scalablytyped.runtime.StringDictionary[js.Array[typings.libphonenumberJs.typesMod.CountryCode]]
  type E164Number = java.lang.String
  type Extension = java.lang.String
  type FormatExtension = js.Function3[
    /* formattedNumber */ java.lang.String, 
    /* extension */ typings.libphonenumberJs.typesMod.Extension, 
    /* metadata */ typings.libphonenumberJs.typesMod.Metadata, 
    java.lang.String
  ]
  type NationalNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - typings.libphonenumberJs.libphonenumberJsStrings.PREMIUM_RATE
    - typings.libphonenumberJs.libphonenumberJsStrings.TOLL_FREE
    - typings.libphonenumberJs.libphonenumberJsStrings.SHARED_COST
    - typings.libphonenumberJs.libphonenumberJsStrings.VOIP
    - typings.libphonenumberJs.libphonenumberJsStrings.PERSONAL_NUMBER
    - typings.libphonenumberJs.libphonenumberJsStrings.PAGER
    - typings.libphonenumberJs.libphonenumberJsStrings.UAN
    - typings.libphonenumberJs.libphonenumberJsStrings.VOICEMAIL
    - typings.libphonenumberJs.libphonenumberJsStrings.FIXED_LINE_OR_MOBILE
    - typings.libphonenumberJs.libphonenumberJsStrings.FIXED_LINE
    - typings.libphonenumberJs.libphonenumberJsStrings.MOBILE
  */
  type NumberType = js.UndefOr[typings.libphonenumberJs.typesMod._NumberType]
}
