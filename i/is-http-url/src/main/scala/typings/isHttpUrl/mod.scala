package typings.isHttpUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Validate URLs for sane values.
    *
    * Does the following:
    *
    * - Protocol should be one of `http:` or `https:`
    * - Hostname should be [valid domain](http://github.com/emilbayes/is-domain-name) name or IPv4 address (TODO: IPv6)
    * - Port, if given, should be an integer in the range `[1, 65535]`
    *
    * @example
    * // Example usage could be to validate the Origin or Referer HTTP headers
    * import * as assert from 'assert'
    * import isHttpUrl = require('is-http-url')
    *
    * assert.ok(isHttpUrl('http://example.com/hello-world.txt'))
    * assert.ok(!isHttpUrl('//test'))
    */
  inline def apply(url: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-http-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
