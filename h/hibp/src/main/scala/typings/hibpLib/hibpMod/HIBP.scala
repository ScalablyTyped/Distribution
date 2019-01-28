package typings
package hibpLib.hibpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HIBP extends js.Object {
  @JSName("breach")
  var breach_Original: js.Function2[
    /* breachName */ java.lang.String, 
    /* options */ js.UndefOr[hibpLib.Anon_BaseUrl], 
    js.Promise[Breach | scala.Null]
  ] = js.native
  @JSName("breachedAccount")
  var breachedAccount_Original: js.Function2[
    /* account */ java.lang.String, 
    /* options */ js.UndefOr[hibpLib.Anon_BaseUrlDomain], 
    js.Promise[js.Array[Breach] | scala.Null]
  ] = js.native
  @JSName("breaches")
  var breaches_Original: js.Function1[
    /* options */ js.UndefOr[hibpLib.Anon_BaseUrlDomainUserAgent], 
    js.Promise[js.Array[Breach]]
  ] = js.native
  @JSName("dataClasses")
  var dataClasses_Original: js.Function1[
    /* options */ js.UndefOr[hibpLib.Anon_BaseUrl], 
    js.Promise[js.Array[java.lang.String] | scala.Null]
  ] = js.native
  @JSName("pasteAccount")
  var pasteAccount_Original: js.Function2[
    /* email */ java.lang.String, 
    /* options */ js.UndefOr[hibpLib.Anon_BaseUrl], 
    js.Promise[js.Array[Paste] | scala.Null]
  ] = js.native
  @JSName("pwnedPasswordRange")
  var pwnedPasswordRange_Original: js.Function2[
    /* prefix */ java.lang.String, 
    /* options */ js.UndefOr[hibpLib.Anon_BaseUrl], 
    js.Promise[js.Array[PwnedPasswordSuffix]]
  ] = js.native
  @JSName("pwnedPassword")
  var pwnedPassword_Original: js.Function2[
    /* password */ java.lang.String, 
    /* options */ js.UndefOr[hibpLib.Anon_BaseUrl], 
    js.Promise[scala.Double]
  ] = js.native
  @JSName("search")
  var search_Original: js.Function2[
    /* account */ java.lang.String, 
    /* breachOptions */ js.UndefOr[hibpLib.Anon_BaseUrlDomainTruncate], 
    js.Promise[SearchResults]
  ] = js.native
  def breach(breachName: java.lang.String): js.Promise[Breach | scala.Null] = js.native
  def breach(breachName: java.lang.String, options: hibpLib.Anon_BaseUrl): js.Promise[Breach | scala.Null] = js.native
  def breachedAccount(account: java.lang.String): js.Promise[js.Array[Breach] | scala.Null] = js.native
  def breachedAccount(account: java.lang.String, options: hibpLib.Anon_BaseUrlDomain): js.Promise[js.Array[Breach] | scala.Null] = js.native
  def breaches(): js.Promise[js.Array[Breach]] = js.native
  def breaches(options: hibpLib.Anon_BaseUrlDomainUserAgent): js.Promise[js.Array[Breach]] = js.native
  def dataClasses(): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  def dataClasses(options: hibpLib.Anon_BaseUrl): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  def pasteAccount(email: java.lang.String): js.Promise[js.Array[Paste] | scala.Null] = js.native
  def pasteAccount(email: java.lang.String, options: hibpLib.Anon_BaseUrl): js.Promise[js.Array[Paste] | scala.Null] = js.native
  def pwnedPassword(password: java.lang.String): js.Promise[scala.Double] = js.native
  def pwnedPassword(password: java.lang.String, options: hibpLib.Anon_BaseUrl): js.Promise[scala.Double] = js.native
  def pwnedPasswordRange(prefix: java.lang.String): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def pwnedPasswordRange(prefix: java.lang.String, options: hibpLib.Anon_BaseUrl): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def search(account: java.lang.String): js.Promise[SearchResults] = js.native
  def search(account: java.lang.String, breachOptions: hibpLib.Anon_BaseUrlDomainTruncate): js.Promise[SearchResults] = js.native
}

