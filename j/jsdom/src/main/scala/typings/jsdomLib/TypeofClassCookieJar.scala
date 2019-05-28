package typings
package jsdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassCookieJar
  extends org.scalablytyped.runtime.Instantiable0[toughDashCookieLib.toughDashCookieMod.CookieJar] {
  def deserialize(
    serialized: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* object */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def deserialize(
    serialized: java.lang.String,
    store: toughDashCookieLib.toughDashCookieMod.Store,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* object */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def deserialize(
    serialized: toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* object */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def deserialize(
    serialized: toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized,
    store: toughDashCookieLib.toughDashCookieMod.Store,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* object */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def deserializeSync(serialized: java.lang.String): toughDashCookieLib.toughDashCookieMod.CookieJar = js.native
  def deserializeSync(serialized: java.lang.String, store: toughDashCookieLib.toughDashCookieMod.Store): toughDashCookieLib.toughDashCookieMod.CookieJar = js.native
  def deserializeSync(serialized: toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized): toughDashCookieLib.toughDashCookieMod.CookieJar = js.native
  def deserializeSync(
    serialized: toughDashCookieLib.toughDashCookieMod.CookieJarNs.Serialized,
    store: toughDashCookieLib.toughDashCookieMod.Store
  ): toughDashCookieLib.toughDashCookieMod.CookieJar = js.native
  def fromJSON(string: java.lang.String): toughDashCookieLib.toughDashCookieMod.CookieJar = js.native
}

