package typings.loglevelPluginPrefix.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoglevelPluginPrefixOptions extends js.Object {
  
  var format: js.UndefOr[
    js.Function3[
      /* level */ String, 
      /* name */ js.UndefOr[String], 
      /* timestamp */ Date, 
      js.UndefOr[String]
    ]
  ] = js.native
  
  var levelFormatter: js.UndefOr[js.Function1[/* level */ String, String]] = js.native
  
  var nameFormatter: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], String]] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var timestampFormatter: js.UndefOr[js.Function1[/* date */ Date, String]] = js.native
}
object LoglevelPluginPrefixOptions {
  
  @scala.inline
  def apply(): LoglevelPluginPrefixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoglevelPluginPrefixOptions]
  }
  
  @scala.inline
  implicit class LoglevelPluginPrefixOptionsOps[Self <: LoglevelPluginPrefixOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(
      value: (/* level */ String, /* name */ js.UndefOr[String], /* timestamp */ Date) => js.UndefOr[String]
    ): Self = this.set("format", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLevelFormatter(value: /* level */ String => String): Self = this.set("levelFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLevelFormatter: Self = this.set("levelFormatter", js.undefined)
    
    @scala.inline
    def setNameFormatter(value: /* name */ js.UndefOr[String] => String): Self = this.set("nameFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNameFormatter: Self = this.set("nameFormatter", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTimestampFormatter(value: /* date */ Date => String): Self = this.set("timestampFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTimestampFormatter: Self = this.set("timestampFormatter", js.undefined)
  }
}
