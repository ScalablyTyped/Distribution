package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
  * @since 1.8
  */
trait PropHooks
  extends /* property */ org.scalablytyped.runtime.StringDictionary[PropHook[Node]]

object PropHooks {
  @scala.inline
  def apply(StringDictionary: /* property */ org.scalablytyped.runtime.StringDictionary[PropHook[Node]] = null): PropHooks = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PropHooks]
  }
}

