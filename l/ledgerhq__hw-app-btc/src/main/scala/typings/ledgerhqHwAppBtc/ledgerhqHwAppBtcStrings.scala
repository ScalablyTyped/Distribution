package typings.ledgerhqHwAppBtc

import typings.ledgerhqHwAppBtc.mod.AddressFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ledgerhqHwAppBtcStrings {
  
  @scala.inline
  def bech32: bech32 = "bech32".asInstanceOf[bech32]
  
  @scala.inline
  def legacy: legacy = "legacy".asInstanceOf[legacy]
  
  @scala.inline
  def p2sh: p2sh = "p2sh".asInstanceOf[p2sh]
  
  @js.native
  sealed trait bech32 extends AddressFormat
  
  @js.native
  sealed trait legacy extends AddressFormat
  
  @js.native
  sealed trait p2sh extends AddressFormat
}
