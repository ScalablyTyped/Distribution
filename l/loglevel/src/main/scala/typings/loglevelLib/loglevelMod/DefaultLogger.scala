package typings
package loglevelLib.loglevelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultLogger extends Logger {
  /**
    * This gets you a new logger object that works exactly like the root log object, but can have its level and
    * logging methods set independently. All loggers must have a name (which is a non-empty string). Calling
    * getLogger() multiple times with the same name will return an identical logger object.
    * In large applications, it can be incredibly useful to turn logging on and off for particular modules as you are
    * working with them. Using the getLogger() method lets you create a separate logger for each part of your
    * application with its own logging level. Likewise, for small, independent modules, using a named logger instead
    * of the default root logger allows developers using your module to selectively turn on deep, trace-level logging
    * when trying to debug problems, while logging only errors or silencing logging altogether under normal
    * circumstances.
    * @param name The name of the produced logger
    */
  def getLogger(name: java.lang.String): Logger = js.native
  /**
    * If you're using another JavaScript library that exposes a 'log' global, you can run into conflicts with loglevel.
    * Similarly to jQuery, you can solve this by putting loglevel into no-conflict mode immediately after it is loaded
    * onto the page. This resets to 'log' global to its value before loglevel was loaded (typically undefined), and
    * returns the loglevel object, which you can then bind to another name yourself.
    */
  def noConflict(): js.Any = js.native
}

