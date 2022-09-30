package typings.jestCircus

import typings.jestTypes.mod.BlockFn
import typings.jestTypes.mod.BlockNameLike
import typings.jestTypes.mod.EachTable
import typings.jestTypes.mod.EachTestFn
import typings.jestTypes.mod.TemplateData
import typings.jestTypes.mod.TestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(blockName: BlockNameLike, blockFn: BlockFn): Unit = js.native
    
    def each(
      table: EachTable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param taggedTemplateData because its type Global.TemplateData is not an array type */ taggedTemplateData: TemplateData
    ): js.Function3[
        /* title */ BlockNameLike, 
        /* test */ EachTestFn[TestCallback], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
  }
  
  @js.native
  trait Each extends StObject {
    
    def apply(blockName: BlockNameLike, blockFn: BlockFn): Unit = js.native
    
    def each(
      table: EachTable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param taggedTemplateData because its type Global.TemplateData is not an array type */ taggedTemplateData: TemplateData
    ): js.Function3[
        /* title */ BlockNameLike, 
        /* test */ EachTestFn[TestCallback], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
    
    var only: Call = js.native
    
    var skip: Call = js.native
  }
}
