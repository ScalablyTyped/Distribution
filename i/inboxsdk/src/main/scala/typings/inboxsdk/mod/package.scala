package typings.inboxsdk.mod

import typings.inboxsdk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def load(version: Double): js.Promise[InboxSDKInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InboxSDKInstance]]
inline def load(version: Double, appId: String): js.Promise[InboxSDKInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InboxSDKInstance]]
inline def load(version: Double, appId: String, opts: LoadOptions): js.Promise[InboxSDKInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InboxSDKInstance]]
inline def load(version: Double, appId: Unit, opts: LoadOptions): js.Promise[InboxSDKInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InboxSDKInstance]]

inline def loadScript(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def loadScript(url: String, options: LoadScriptOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
