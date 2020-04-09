package typings.jestRuntime

import typings.yargs.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'cache' | 'config' | 'debug' | 'version' | 'watchman', yargs.yargs.Options> */
trait Recordcacheconfigdebugver extends js.Object {
  var cache: Options
  var config: Options
  var debug: Options
  var version: Options
  var watchman: Options
}

object Recordcacheconfigdebugver {
  @scala.inline
  def apply(cache: Options, config: Options, debug: Options, version: Options, watchman: Options): Recordcacheconfigdebugver = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Recordcacheconfigdebugver]
  }
}

