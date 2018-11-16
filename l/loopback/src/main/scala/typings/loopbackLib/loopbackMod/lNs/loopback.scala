package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface CookieOptions extends core.CookieOptions { }
// interface Errback extends core.Errback { }
// interface ErrorRequestHandler extends core.ErrorRequestHandler { }
// interface Express extends core.Express { }
// interface Handler extends core.Handler { }
// interface Route extends core.IRoute { }
// interface Routers<T> extends core.IRouter<T> { }
// interface RouterMatcher<T> extends core.IRouterMatcher<T> { }
// interface MediaType extends core.MediaType { }
// interface NextFunction extends core.NextFunction { }
// interface Request extends core.Request { }
// interface RequestHandler extends core.RequestHandler { }
// interface RequestParamHandler extends core.RequestParamHandler { }
// export interface Response extends core.Response { }
// interface Router extends core.Router { }
// interface Send extends core.Send { }
/**
       * LoopBack core module. It provides static properties and
       * methods to create models and data sources. The module itself is a function
       * that creates loopback `app`. For example:
       *
       * ```js
       * var loopback = require('loopback');
       * var app = loopback();
       * ```
       *
       * @property {string} version Version of LoopBack framework.  Static read-only property.
       * @property {string} mime
       * @property {boolean} isBrowser True if running in a browser environment; false otherwise.  Static read-only property.
       * @property {boolean} isServer True if running in a server environment; false otherwise.  Static read-only property.
       * @property {Registry} registry The global `Registry` object.
       * @property {string} faviconFile Path to a default favicon shipped with LoopBack.
       * Use as follows: `app.use(require('serve-favicon')(loopback.faviconFile));`
       * @class loopback
       * @header loopback
       */

trait loopback extends js.Object {
  /** Path to a default favicon shipped with LoopBack.
               * Use as follows: `app.use(require('serve-favicon')(loopback.faviconFile));`
               */
  var faviconFile: java.lang.String
  /** True if running in a browser environment; false otherwise.  Static read-only property. */
  var isBrowser: scala.Boolean
  /** True if running in a server environment; false otherwise.  Static read-only property. */
  var isServer: scala.Boolean
  /** Mime */
  var mime: java.lang.String
  /** The global `Registry` object. */
  var registry: Registry
  /** Version of LoopBack framework.  Static read-only property. */
  var version: java.lang.String
}

