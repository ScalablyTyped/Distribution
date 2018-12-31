package typings
package koaDashPassportLib.koaDashPassportMod.KoaPassportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaPassport extends js.Object {
  var deserializeUser: js.Function1[
    /* fn */ js.Function2[
      /* id */ js.Any, 
      /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  var serializeUser: js.Function1[
    /* fn */ js.Function2[
      /* user */ js.Any, 
      /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  var transformAuthInfo: js.Function1[
    /* fn */ js.Function2[
      /* info */ js.Any, 
      /* done */ js.Function2[/* err */ js.Any, /* info */ js.Any, scala.Unit], 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  def authenticate(strategy: java.lang.String): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(strategy: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(strategy: java.lang.String, options: js.Object): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(strategy: java.lang.String, options: js.Object, callback: js.Function1[/* repeated */ js.Any, _]): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(strategy: java.lang.String, options: passportLib.passportMod.passportNs.AuthenticateOptions): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(
    strategy: java.lang.String,
    options: passportLib.passportMod.passportNs.AuthenticateOptions,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(strategy: js.Array[java.lang.String]): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(strategy: js.Array[java.lang.String], callback: js.Function1[/* repeated */ js.Any, _]): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(strategy: js.Array[java.lang.String], options: js.Object): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(
    strategy: js.Array[java.lang.String],
    options: js.Object,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(
    strategy: js.Array[java.lang.String],
    options: passportLib.passportMod.passportNs.AuthenticateOptions
  ): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authenticate(
    strategy: js.Array[java.lang.String],
    options: passportLib.passportMod.passportNs.AuthenticateOptions,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authorize(strategy: java.lang.String): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authorize(strategy: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authorize(strategy: java.lang.String, options: js.Any): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authorize(strategy: java.lang.String, options: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authorize(strategy: js.Array[java.lang.String]): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authorize(strategy: js.Array[java.lang.String], callback: js.Function1[/* repeated */ js.Any, _]): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authorize(strategy: js.Array[java.lang.String], options: js.Any): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def authorize(
    strategy: js.Array[java.lang.String],
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def framework(fw: passportLib.passportMod.passportNs.Framework[_, _, _]): this.type = js.native
  def initialize(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def initialize(options: koaDashPassportLib.Anon_UserProperty): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def session(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def session(options: koaDashPassportLib.Anon_PauseStream): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def unuse(name: java.lang.String): this.type = js.native
  def use(name: java.lang.String, strategy: passportLib.passportMod.passportNs.Strategy): this.type = js.native
  def use(strategy: passportLib.passportMod.passportNs.Strategy): this.type = js.native
}

