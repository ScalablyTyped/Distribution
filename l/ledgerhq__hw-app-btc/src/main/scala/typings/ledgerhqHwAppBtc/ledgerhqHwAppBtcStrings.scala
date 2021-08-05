package typings.ledgerhqHwAppBtc

import typings.ledgerhqHwAppBtc.mod.AddressFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ledgerhqHwAppBtcStrings {
  
  @js.native
  sealed trait bech32
    extends StObject
       with AddressFormat
  inline def bech32: bech32 = "bech32".asInstanceOf[bech32]
  
  @js.native
  sealed trait legacy
    extends StObject
       with AddressFormat
  inline def legacy: legacy = "legacy".asInstanceOf[legacy]
  
  @js.native
  sealed trait p2sh
    extends StObject
       with AddressFormat
  inline def p2sh: p2sh = "p2sh".asInstanceOf[p2sh]
}
