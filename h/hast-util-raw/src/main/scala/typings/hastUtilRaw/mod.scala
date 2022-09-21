package typings.hastUtilRaw

import typings.hastUtilRaw.complexTypesMod.Raw
import typings.hastUtilRaw.libMod.Node
import typings.hastUtilRaw.libMod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-raw", "raw")
  @js.native
  val raw: (js.Function3[
    /* tree */ Node, 
    /* file */ js.UndefOr[VFile], 
    /* options */ js.UndefOr[typings.hastUtilRaw.libMod.Options], 
    Node
  ]) & (js.Function2[/* tree */ Node, /* options */ js.UndefOr[typings.hastUtilRaw.libMod.Options], Node]) = js.native
  
  type Options = typings.hastUtilRaw.libMod.Options
  
  type Raw_ = Raw
}
