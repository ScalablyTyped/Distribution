package typings.hidefile

import typings.node.Buffer
import typings.node.urlMod.URL_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hidefile", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def hide(
    path: String,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  def hide(
    path: Buffer,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  def hide(
    path: URL_,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  
  def hideSync(path: String): String | Buffer | URL_ = js.native
  def hideSync(path: Buffer): String | Buffer | URL_ = js.native
  def hideSync(path: URL_): String | Buffer | URL_ = js.native
  
  def isDotPrefixed(path: String): Boolean = js.native
  def isDotPrefixed(path: Buffer): Boolean = js.native
  def isDotPrefixed(path: URL_): Boolean = js.native
  
  def isHidden(path: String, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, _]): Unit = js.native
  def isHidden(path: Buffer, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, _]): Unit = js.native
  def isHidden(path: URL_, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, _]): Unit = js.native
  
  def isHiddenSync(path: String): Boolean = js.native
  def isHiddenSync(path: Buffer): Boolean = js.native
  def isHiddenSync(path: URL_): Boolean = js.native
  
  def reveal(
    path: String,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  def reveal(
    path: Buffer,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  def reveal(
    path: URL_,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], _]
  ): Unit = js.native
  
  def revealSync(path: String): String | Buffer | URL_ = js.native
  def revealSync(path: Buffer): String | Buffer | URL_ = js.native
  def revealSync(path: URL_): String | Buffer | URL_ = js.native
  
  def shouldBeHidden(path: String, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, _]): Unit = js.native
  def shouldBeHidden(path: Buffer, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, _]): Unit = js.native
  def shouldBeHidden(path: URL_, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, _]): Unit = js.native
  
  def shouldBeHiddenSync(path: String): Boolean = js.native
  def shouldBeHiddenSync(path: Buffer): Boolean = js.native
  def shouldBeHiddenSync(path: URL_): Boolean = js.native
}
