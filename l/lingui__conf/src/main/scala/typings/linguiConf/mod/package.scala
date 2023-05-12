package typings.linguiConf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.linguiConf.anon.ConfigPath
import typings.linguiConf.anon.PartialLinguiConfig
import typings.linguiConf.anon.SkipValidation
import typings.linguiConf.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getConfig(): LinguiConfigNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[LinguiConfigNormalized]
inline def getConfig(param0: ConfigPath): LinguiConfigNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(param0.asInstanceOf[js.Any]).asInstanceOf[LinguiConfigNormalized]

inline def makeConfig(userConfig: PartialLinguiConfig): LinguiConfigNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("makeConfig")(userConfig.asInstanceOf[js.Any]).asInstanceOf[LinguiConfigNormalized]
inline def makeConfig(userConfig: PartialLinguiConfig, opts: SkipValidation): LinguiConfigNormalized = (^.asInstanceOf[js.Dynamic].applyDynamic("makeConfig")(userConfig.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LinguiConfigNormalized]

type CatalogExtra = Record[String, Any]

type CatalogType[Extra] = StringDictionary[MessageType[Extra]]

type ExtractedCatalogType[Extra] = StringDictionary[ExtractedMessageType[Extra]]

type FallbackLocales = LocaleObject

type MessageOrigin = js.Tuple2[/* filename */ String, /* line */ js.UndefOr[Double]]

type ModuleSource = js.Tuple2[String, js.UndefOr[String]]
