package typings.inboxsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def load(version: scala.Double): js.Promise[typings.inboxsdk.mod.InboxSDKInstance] = typings.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.inboxsdk.mod.InboxSDKInstance]]
@scala.inline
def load(version: scala.Double, appId: java.lang.String): js.Promise[typings.inboxsdk.mod.InboxSDKInstance] = (typings.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.inboxsdk.mod.InboxSDKInstance]]
@scala.inline
def load(version: scala.Double, appId: java.lang.String, opts: typings.inboxsdk.mod.LoadOptions): js.Promise[typings.inboxsdk.mod.InboxSDKInstance] = (typings.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.inboxsdk.mod.InboxSDKInstance]]
@scala.inline
def load(version: scala.Double, appId: scala.Unit, opts: typings.inboxsdk.mod.LoadOptions): js.Promise[typings.inboxsdk.mod.InboxSDKInstance] = (typings.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.inboxsdk.mod.InboxSDKInstance]]

@scala.inline
def loadScript(url: java.lang.String): js.Promise[scala.Unit] = typings.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
@scala.inline
def loadScript(url: java.lang.String, options: typings.inboxsdk.mod.LoadScriptOptions): js.Promise[scala.Unit] = (typings.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
