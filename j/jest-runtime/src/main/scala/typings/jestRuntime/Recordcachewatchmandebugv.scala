package typings.jestRuntime

import typings.yargs.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'cache' | 'watchman' | 'debug' | 'version' | 'config', yargs.yargs.Options> */
trait Recordcachewatchmandebugv extends js.Object {
  var cache: Options
  var config: Options
  var debug: Options
  var version: Options
  var watchman: Options
}

object Recordcachewatchmandebugv {
  @scala.inline
  def apply(cache: Options, config: Options, debug: Options, version: Options, watchman: Options): Recordcachewatchmandebugv = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Recordcachewatchmandebugv]
  }
}

