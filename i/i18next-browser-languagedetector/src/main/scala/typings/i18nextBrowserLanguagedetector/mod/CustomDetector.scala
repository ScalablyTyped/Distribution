package typings.i18nextBrowserLanguagedetector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDetector extends js.Object {
  
  var cacheUserLanguage: js.UndefOr[js.Function2[/* lng */ String, /* options */ DetectorOptions, Unit]] = js.native
  
  def lookup(options: DetectorOptions): js.UndefOr[String] = js.native
  
  var name: String = js.native
}
object CustomDetector {
  
  @scala.inline
  def apply(lookup: DetectorOptions => js.UndefOr[String], name: String): CustomDetector = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDetector]
  }
  
  @scala.inline
  implicit class CustomDetectorOps[Self <: CustomDetector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLookup(value: DetectorOptions => js.UndefOr[String]): Self = this.set("lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUserLanguage(value: (/* lng */ String, /* options */ DetectorOptions) => Unit): Self = this.set("cacheUserLanguage", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCacheUserLanguage: Self = this.set("cacheUserLanguage", js.undefined)
  }
}
