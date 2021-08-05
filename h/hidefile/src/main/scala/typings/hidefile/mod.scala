package typings.hidefile

import typings.node.Buffer
import typings.node.urlMod.URL_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hidefile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hide(
    path: String,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hide")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hide(
    path: Buffer,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hide")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hide(
    path: URL_,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hide")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hideSync(path: String): String | Buffer | URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hideSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer | URL_]
  inline def hideSync(path: Buffer): String | Buffer | URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hideSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer | URL_]
  inline def hideSync(path: URL_): String | Buffer | URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hideSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer | URL_]
  
  inline def isDotPrefixed(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDotPrefixed")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDotPrefixed(path: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDotPrefixed")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDotPrefixed(path: URL_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDotPrefixed")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHidden(path: String, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isHidden")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def isHidden(path: Buffer, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isHidden")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def isHidden(path: URL_, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isHidden")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isHiddenSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHiddenSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isHiddenSync(path: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHiddenSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isHiddenSync(path: URL_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHiddenSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def reveal(
    path: String,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reveal")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reveal(
    path: Buffer,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reveal")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reveal(
    path: URL_,
    callback: js.Function2[/* error */ Error | Null, /* newpath */ js.UndefOr[String | Buffer | URL_], js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reveal")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def revealSync(path: String): String | Buffer | URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("revealSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer | URL_]
  inline def revealSync(path: Buffer): String | Buffer | URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("revealSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer | URL_]
  inline def revealSync(path: URL_): String | Buffer | URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("revealSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer | URL_]
  
  inline def shouldBeHidden(path: String, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldBeHidden")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shouldBeHidden(path: Buffer, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldBeHidden")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shouldBeHidden(path: URL_, callback: js.Function2[/* error */ Error | Null, /* result */ Boolean, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldBeHidden")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shouldBeHiddenSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldBeHiddenSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shouldBeHiddenSync(path: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldBeHiddenSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shouldBeHiddenSync(path: URL_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldBeHiddenSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
