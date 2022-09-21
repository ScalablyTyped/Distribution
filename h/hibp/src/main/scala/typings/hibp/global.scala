package typings.hibp

import typings.hibp.anon.ApiKey
import typings.hibp.anon.BaseUrl
import typings.hibp.anon.Domain
import typings.hibp.anon.Truncate
import typings.hibp.anon.UserAgent
import typings.hibp.mod.Breach_
import typings.hibp.mod.Paste
import typings.hibp.mod.PwnedPasswordSuffixes
import typings.hibp.mod.SearchResults
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object hibp {
    
    @JSGlobal("hibp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("hibp.RateLimitError")
    @js.native
    open class RateLimitError protected ()
      extends typings.hibp.mod.RateLimitError {
      def this(
        retryAfter: ReturnType[js.Function1[/* name */ String, String | Null]],
        message: /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['message'] */ js.Any
      ) = this()
      def this(
        retryAfter: ReturnType[js.Function1[/* name */ String, String | Null]],
        message: /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['message'] */ js.Any,
        options: /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['options'] */ js.Any
      ) = this()
    }
    
    inline def breach(breachName: String): js.Promise[Breach_ | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("breach")(breachName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Breach_ | Null]]
    inline def breach(breachName: String, options: BaseUrl): js.Promise[Breach_ | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("breach")(breachName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Breach_ | Null]]
    
    inline def breachedAccount(account: String): js.Promise[js.Array[Breach_] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("breachedAccount")(account.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Breach_] | Null]]
    inline def breachedAccount(account: String, options: ApiKey): js.Promise[js.Array[Breach_] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("breachedAccount")(account.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Breach_] | Null]]
    
    inline def breaches(): js.Promise[js.Array[Breach_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("breaches")().asInstanceOf[js.Promise[js.Array[Breach_]]]
    inline def breaches(options: Domain): js.Promise[js.Array[Breach_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("breaches")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Breach_]]]
    
    inline def dataClasses(): js.Promise[js.Array[String] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataClasses")().asInstanceOf[js.Promise[js.Array[String] | Null]]
    inline def dataClasses(options: BaseUrl): js.Promise[js.Array[String] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataClasses")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String] | Null]]
    
    inline def pasteAccount(email: String): js.Promise[js.Array[Paste] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("pasteAccount")(email.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Paste] | Null]]
    inline def pasteAccount(email: String, options: UserAgent): js.Promise[js.Array[Paste] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("pasteAccount")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Paste] | Null]]
    
    inline def pwnedPassword(password: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("pwnedPassword")(password.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    inline def pwnedPassword(password: String, options: BaseUrl): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pwnedPassword")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def pwnedPasswordRange(prefix: String): js.Promise[PwnedPasswordSuffixes] = ^.asInstanceOf[js.Dynamic].applyDynamic("pwnedPasswordRange")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PwnedPasswordSuffixes]]
    inline def pwnedPasswordRange(prefix: String, options: BaseUrl): js.Promise[PwnedPasswordSuffixes] = (^.asInstanceOf[js.Dynamic].applyDynamic("pwnedPasswordRange")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PwnedPasswordSuffixes]]
    
    inline def search(account: String): js.Promise[SearchResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(account.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResults]]
    inline def search(account: String, breachOptions: Truncate): js.Promise[SearchResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(account.asInstanceOf[js.Any], breachOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchResults]]
  }
}
