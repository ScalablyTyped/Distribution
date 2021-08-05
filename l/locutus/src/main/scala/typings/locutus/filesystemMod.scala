package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesystemMod {
  
  @JSImport("locutus/php/filesystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def basename(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")().asInstanceOf[js.Any]
  inline def basename(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def basename(path: js.Any, suffix: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def basename(path: Unit, suffix: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def dirname(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")().asInstanceOf[js.Any]
  inline def dirname(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def fileGetContents(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")().asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: js.Any, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: js.Any, context: js.Any, offset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: js.Any, context: js.Any, offset: js.Any, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: js.Any, context: js.Any, offset: Unit, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: js.Any, context: Unit, offset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: js.Any, context: Unit, offset: js.Any, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: js.Any, context: Unit, offset: Unit, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: Unit, context: js.Any, offset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: Unit, context: js.Any, offset: js.Any, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: Unit, context: js.Any, offset: Unit, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: Unit, context: Unit, offset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: Unit, context: Unit, offset: js.Any, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: js.Any, flags: Unit, context: Unit, offset: Unit, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: js.Any, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: js.Any, context: js.Any, offset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: js.Any, context: js.Any, offset: js.Any, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: js.Any, context: js.Any, offset: Unit, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: js.Any, context: Unit, offset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: js.Any, context: Unit, offset: js.Any, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: js.Any, context: Unit, offset: Unit, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: Unit, context: js.Any, offset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: Unit, context: js.Any, offset: js.Any, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: Unit, context: js.Any, offset: Unit, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: Unit, context: Unit, offset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: Unit, context: Unit, offset: js.Any, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fileGetContents(url: Unit, flags: Unit, context: Unit, offset: Unit, maxLen: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("file_get_contents")(url.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], context.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def pathinfo(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pathinfo")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def realpath(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")().asInstanceOf[js.Any]
  inline def realpath(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
