package typings.jssha.sha3Mod

import typings.jssha.jsshaStrings.CSHAKE128
import typings.jssha.jsshaStrings.CSHAKE256
import typings.jssha.jsshaStrings.KMAC128
import typings.jssha.jsshaStrings.KMAC256
import typings.jssha.jsshaStrings.SHAKE128
import typings.jssha.jsshaStrings.SHAKE256
import typings.jssha.jsshaStrings.TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jssha/dist/sha3", JSImport.Default)
@js.native
open class default protected ()
  extends StObject
     with jsSHA {
  def this(variant: CSHAKE128 | CSHAKE256 | SHAKE128 | SHAKE256, inputFormat: TEXT) = this()
  def this(variant: CSHAKE128 | CSHAKE256 | SHAKE128 | SHAKE256, inputFormat: FormatNoTextType) = this()
  def this(variant: FixedLengthVariantType, inputFormat: TEXT) = this()
  def this(variant: FixedLengthVariantType, inputFormat: FormatNoTextType) = this()
  def this(variant: CSHAKE128 | CSHAKE256, inputFormat: TEXT, options: CSHAKEOptionsEncodingType) = this()
  def this(variant: KMAC128 | KMAC256, inputFormat: TEXT, options: KMACOptionsEncodingType) = this()
  def this(variant: SHAKE128 | SHAKE256, inputFormat: TEXT, options: SHAKEOptionsEncodingType) = this()
  def this(
    variant: CSHAKE128 | CSHAKE256,
    inputFormat: FormatNoTextType,
    options: CSHAKEOptionsNoEncodingType
  ) = this()
  def this(variant: KMAC128 | KMAC256, inputFormat: FormatNoTextType, options: KMACOptionsNoEncodingType) = this()
  def this(variant: SHAKE128 | SHAKE256, inputFormat: FormatNoTextType, options: SHAKEOptionsNoEncodingType) = this()
  def this(variant: FixedLengthVariantType, inputFormat: TEXT, options: FixedLengthOptionsEncodingType) = this()
  def this(
    variant: FixedLengthVariantType,
    inputFormat: FormatNoTextType,
    options: FixedLengthOptionsNoEncodingType
  ) = this()
}
