package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.karma.karmaStrings.Chrome
  - typings.karma.karmaStrings.ChromeCanary
  - typings.karma.karmaStrings.ChromeHeadless
  - typings.karma.karmaStrings.PhantomJS
  - typings.karma.karmaStrings.Firefox
  - typings.karma.karmaStrings.Opera
  - typings.karma.karmaStrings.IE
  - typings.karma.karmaStrings.Safari
*/
trait AutomatedBrowsers extends js.Object

object AutomatedBrowsers {
  @scala.inline
  def Chrome: typings.karma.karmaStrings.Chrome = this.cast("Chrome")
  @scala.inline
  def ChromeCanary: typings.karma.karmaStrings.ChromeCanary = this.cast("ChromeCanary")
  @scala.inline
  def ChromeHeadless: typings.karma.karmaStrings.ChromeHeadless = this.cast("ChromeHeadless")
  @scala.inline
  def Firefox: typings.karma.karmaStrings.Firefox = this.cast("Firefox")
  @scala.inline
  def IE: typings.karma.karmaStrings.IE = this.cast("IE")
  @scala.inline
  def Opera: typings.karma.karmaStrings.Opera = this.cast("Opera")
  @scala.inline
  def PhantomJS: typings.karma.karmaStrings.PhantomJS = this.cast("PhantomJS")
  @scala.inline
  def Safari: typings.karma.karmaStrings.Safari = this.cast("Safari")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

