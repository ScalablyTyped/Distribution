package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encryption extends StObject {
  
  /**
    * If false (default), crypto will not be automatically set up for all intent
    * instances - it will need to be manually enabled with
    * `await intent.enableEncryption()`.
    *
    * If true, crypto will be automatically set up.
    *
    * Note that the appservice bot account is considered an intent.
    */
  var encryption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum age in milliseconds to keep an Intent around for, provided
    * the maximum number of intents has been reached. Defaults to 60 minutes.
    */
  var maxAgeMs: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of intents to keep cached. Defaults to 10 thousand.
    */
  var maxCached: js.UndefOr[Double] = js.undefined
}
object Encryption {
  
  inline def apply(): Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encryption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encryption] (val x: Self) extends AnyVal {
    
    inline def setEncryption(value: Boolean): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setMaxAgeMs(value: Double): Self = StObject.set(x, "maxAgeMs", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeMsUndefined: Self = StObject.set(x, "maxAgeMs", js.undefined)
    
    inline def setMaxCached(value: Double): Self = StObject.set(x, "maxCached", value.asInstanceOf[js.Any])
    
    inline def setMaxCachedUndefined: Self = StObject.set(x, "maxCached", js.undefined)
  }
}
