package typings.karma

import typings.karma.mod.AutomatedBrowsers
import typings.karma.mod.FilePatternTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object karmaStrings {
  @js.native
  sealed trait Chrome extends AutomatedBrowsers
  
  @js.native
  sealed trait ChromeCanary extends AutomatedBrowsers
  
  @js.native
  sealed trait ChromeHeadless extends AutomatedBrowsers
  
  @js.native
  sealed trait Firefox extends AutomatedBrowsers
  
  @js.native
  sealed trait IE extends AutomatedBrowsers
  
  @js.native
  sealed trait Opera extends AutomatedBrowsers
  
  @js.native
  sealed trait PhantomJS extends AutomatedBrowsers
  
  @js.native
  sealed trait Safari extends AutomatedBrowsers
  
  @js.native
  sealed trait css extends FilePatternTypes
  
  @js.native
  sealed trait dart extends FilePatternTypes
  
  @js.native
  sealed trait debug extends js.Object
  
  @js.native
  sealed trait dom extends FilePatternTypes
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait factory extends js.Object
  
  @js.native
  sealed trait html extends FilePatternTypes
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait js_ extends FilePatternTypes
  
  @js.native
  sealed trait log extends js.Object
  
  @js.native
  sealed trait module extends FilePatternTypes
  
  @js.native
  sealed trait run_complete extends js.Object
  
  @js.native
  sealed trait `type` extends js.Object
  
  @js.native
  sealed trait value extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def Chrome: Chrome = "Chrome".asInstanceOf[Chrome]
  @scala.inline
  def ChromeCanary: ChromeCanary = "ChromeCanary".asInstanceOf[ChromeCanary]
  @scala.inline
  def ChromeHeadless: ChromeHeadless = "ChromeHeadless".asInstanceOf[ChromeHeadless]
  @scala.inline
  def Firefox: Firefox = "Firefox".asInstanceOf[Firefox]
  @scala.inline
  def IE: IE = "IE".asInstanceOf[IE]
  @scala.inline
  def Opera: Opera = "Opera".asInstanceOf[Opera]
  @scala.inline
  def PhantomJS: PhantomJS = "PhantomJS".asInstanceOf[PhantomJS]
  @scala.inline
  def Safari: Safari = "Safari".asInstanceOf[Safari]
  @scala.inline
  def css: css = "css".asInstanceOf[css]
  @scala.inline
  def dart: dart = "dart".asInstanceOf[dart]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def dom: dom = "dom".asInstanceOf[dom]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def factory: factory = "factory".asInstanceOf[factory]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def module: module = "module".asInstanceOf[module]
  @scala.inline
  def run_complete: run_complete = "run_complete".asInstanceOf[run_complete]
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

