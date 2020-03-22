package typings.ionicons

import org.scalablytyped.runtime.StringDictionary
import typings.ionicons.iconMod.Icon
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionicons/dist/types/components/icon/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def addIcons(icons: StringDictionary[String]): Unit = js.native
  def getIconMap(): Map[String, String] = js.native
  def getName(): String | Null = js.native
  def getName(iconName: String): String | Null = js.native
  def getName(iconName: String, icon: String): String | Null = js.native
  def getName(iconName: String, icon: String, mode: String): String | Null = js.native
  def getName(iconName: String, icon: String, mode: String, ios: String): String | Null = js.native
  def getName(iconName: String, icon: String, mode: String, ios: String, md: String): String | Null = js.native
  def getSrc(): String | Null = js.native
  def getSrc(src: String): String | Null = js.native
  def getUrl(i: Icon): String | Null = js.native
  def isSrc(str: String): Boolean = js.native
  def isStr(`val`: js.Any): /* is string */ Boolean = js.native
  def toLower(`val`: String): String = js.native
}

