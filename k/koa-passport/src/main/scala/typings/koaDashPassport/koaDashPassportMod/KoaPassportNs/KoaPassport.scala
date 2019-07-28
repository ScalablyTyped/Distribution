package typings.koaDashPassport.koaDashPassportMod.KoaPassportNs

import typings.koa.koaMod.Middleware
import typings.koaDashPassport.Anon_PauseStream
import typings.koaDashPassport.Anon_UserProperty
import typings.passport.passportMod.AuthenticateOptions
import typings.passport.passportMod.Framework
import typings.passport.passportMod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaPassport extends js.Object {
  @JSName("deserializeUser")
  var deserializeUser_Original: js.Function1[
    /* fn */ js.Function2[
      /* id */ js.Any, 
      /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
      Unit
    ], 
    Unit
  ] = js.native
  @JSName("serializeUser")
  var serializeUser_Original: js.Function1[
    /* fn */ js.Function2[
      /* user */ js.Any, 
      /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[js.Any], Unit], 
      Unit
    ], 
    Unit
  ] = js.native
  @JSName("transformAuthInfo")
  var transformAuthInfo_Original: js.Function1[
    /* fn */ js.Function2[
      /* info */ js.Any, 
      /* done */ js.Function2[/* err */ js.Any, /* info */ js.Any, Unit], 
      Unit
    ], 
    Unit
  ] = js.native
  def authenticate(strategy: String): Middleware[_, js.Object] = js.native
  def authenticate(strategy: String, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[_, js.Object] = js.native
  def authenticate(strategy: String, options: js.Object): Middleware[_, js.Object] = js.native
  def authenticate(strategy: String, options: js.Object, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[_, js.Object] = js.native
  def authenticate(strategy: String, options: AuthenticateOptions): Middleware[_, js.Object] = js.native
  def authenticate(strategy: String, options: AuthenticateOptions, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[_, js.Object] = js.native
  def authenticate(strategy: js.Array[String]): Middleware[_, js.Object] = js.native
  def authenticate(strategy: js.Array[String], callback: js.Function1[/* repeated */ js.Any, _]): Middleware[_, js.Object] = js.native
  def authenticate(strategy: js.Array[String], options: js.Object): Middleware[_, js.Object] = js.native
  def authenticate(strategy: js.Array[String], options: js.Object, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[_, js.Object] = js.native
  def authenticate(strategy: js.Array[String], options: AuthenticateOptions): Middleware[_, js.Object] = js.native
  def authenticate(
    strategy: js.Array[String],
    options: AuthenticateOptions,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Middleware[_, js.Object] = js.native
  def authorize(strategy: String): Middleware[_, js.Object] = js.native
  def authorize(strategy: String, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[_, js.Object] = js.native
  def authorize(strategy: String, options: js.Any): Middleware[_, js.Object] = js.native
  def authorize(strategy: String, options: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[_, js.Object] = js.native
  def authorize(strategy: js.Array[String]): Middleware[_, js.Object] = js.native
  def authorize(strategy: js.Array[String], callback: js.Function1[/* repeated */ js.Any, _]): Middleware[_, js.Object] = js.native
  def authorize(strategy: js.Array[String], options: js.Any): Middleware[_, js.Object] = js.native
  def authorize(strategy: js.Array[String], options: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[_, js.Object] = js.native
  def deserializeUser[TUser, TID](
    fn: js.Function2[
      /* id */ TID, 
      /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
      Unit
    ]
  ): Unit = js.native
  def framework(fw: Framework[_, _, _]): this.type = js.native
  def initialize(): Middleware[_, js.Object] = js.native
  def initialize(options: Anon_UserProperty): Middleware[_, js.Object] = js.native
  def serializeUser[TUser, TID](
    fn: js.Function2[
      /* user */ TUser, 
      /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
      Unit
    ]
  ): Unit = js.native
  def session(): Middleware[_, js.Object] = js.native
  def session(options: Anon_PauseStream): Middleware[_, js.Object] = js.native
  def transformAuthInfo(
    fn: js.Function2[
      /* info */ js.Any, 
      /* done */ js.Function2[/* err */ js.Any, /* info */ js.Any, Unit], 
      Unit
    ]
  ): Unit = js.native
  def unuse(name: String): this.type = js.native
  def use(name: String, strategy: Strategy): this.type = js.native
  def use(strategy: Strategy): this.type = js.native
}

