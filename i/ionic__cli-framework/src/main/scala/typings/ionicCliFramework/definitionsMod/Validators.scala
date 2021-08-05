package typings.ionicCliFramework.definitionsMod

import typings.ionicCliFramework.ionicCliFrameworkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validators extends StObject {
  
  def email(): `true` | String
  def email(input: String): `true` | String
  def email(input: String, key: String): `true` | String
  def email(input: Unit, key: String): `true` | String
  @JSName("email")
  var email_Original: Validator
  
  def numeric(): `true` | String
  def numeric(input: String): `true` | String
  def numeric(input: String, key: String): `true` | String
  def numeric(input: Unit, key: String): `true` | String
  @JSName("numeric")
  var numeric_Original: Validator
  
  def required(): `true` | String
  def required(input: String): `true` | String
  def required(input: String, key: String): `true` | String
  def required(input: Unit, key: String): `true` | String
  @JSName("required")
  var required_Original: Validator
  
  def slug(): `true` | String
  def slug(input: String): `true` | String
  def slug(input: String, key: String): `true` | String
  def slug(input: Unit, key: String): `true` | String
  @JSName("slug")
  var slug_Original: Validator
  
  def url(): `true` | String
  def url(input: String): `true` | String
  def url(input: String, key: String): `true` | String
  def url(input: Unit, key: String): `true` | String
  @JSName("url")
  var url_Original: Validator
}
object Validators {
  
  inline def apply(
    email: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String,
    numeric: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String,
    required: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String,
    slug: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String,
    url: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String
  ): Validators = {
    val __obj = js.Dynamic.literal(email = js.Any.fromFunction2(email), numeric = js.Any.fromFunction2(numeric), required = js.Any.fromFunction2(required), slug = js.Any.fromFunction2(slug), url = js.Any.fromFunction2(url))
    __obj.asInstanceOf[Validators]
  }
  
  extension [Self <: Validators](x: Self) {
    
    inline def setEmail(value: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String): Self = StObject.set(x, "email", js.Any.fromFunction2(value))
    
    inline def setNumeric(value: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String): Self = StObject.set(x, "numeric", js.Any.fromFunction2(value))
    
    inline def setRequired(value: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String): Self = StObject.set(x, "required", js.Any.fromFunction2(value))
    
    inline def setSlug(value: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String): Self = StObject.set(x, "slug", js.Any.fromFunction2(value))
    
    inline def setUrl(value: (/* input */ js.UndefOr[String], /* key */ js.UndefOr[String]) => `true` | String): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
  }
}
