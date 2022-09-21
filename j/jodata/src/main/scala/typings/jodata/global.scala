package typings.jodata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("jo")
  @js.native
  open class jo protected ()
    extends StObject
       with typings.jodata.jo {
    def this(baseUri: String) = this()
  }
  object jo {
    
    @JSGlobal("jo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jo.Concat")
    @js.native
    open class Concat protected ()
      extends StObject
         with typings.jodata.jo.Concat {
      def this(value1: String, value2: String) = this()
      def this(value1: String, value2: typings.jodata.jo.Concat) = this()
      def this(value1: typings.jodata.jo.Concat, value2: String) = this()
      def this(value1: typings.jodata.jo.Concat, value2: typings.jodata.jo.Concat) = this()
      
      /* CompleteClass */
      var LeftSide: String | typings.jodata.jo.Concat = js.native
      
      /* CompleteClass */
      var RightSide: String | typings.jodata.jo.Concat = js.native
    }
    
    @JSGlobal("jo.FilterClause")
    @js.native
    open class FilterClause ()
      extends StObject
         with typings.jodata.jo.FilterClause {
      def this(property: String) = this()
    }
    
    @JSGlobal("jo.PrecedenceGroup")
    @js.native
    open class PrecedenceGroup protected ()
      extends StObject
         with typings.jodata.jo.PrecedenceGroup {
      def this(filterClause: typings.jodata.jo.FilterClause) = this()
      
      /* CompleteClass */
      override def andFilter(filterClause: typings.jodata.jo.FilterClause): typings.jodata.jo.FilterClause = js.native
      
      /* CompleteClass */
      override def orFilter(filterClause: typings.jodata.jo.FilterClause): typings.jodata.jo.FilterClause = js.native
    }
    
    /* static member */
    @JSGlobal("jo.datetime")
    @js.native
    def datetime: js.Function1[/* stringLiteral */ String, String] = js.native
    inline def datetime_=(x: js.Function1[/* stringLiteral */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datetime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("jo.decimal")
    @js.native
    def decimal: js.Function1[/* stringLiteral */ Double, String] = js.native
    inline def decimal_=(x: js.Function1[/* stringLiteral */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("jo.double")
    @js.native
    def double: js.Function1[/* stringLiteral */ Double, String] = js.native
    inline def double_=(x: js.Function1[/* stringLiteral */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("double")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("jo.guid")
    @js.native
    def guid: js.Function1[/* stringLiteral */ String, String] = js.native
    inline def guid_=(x: js.Function1[/* stringLiteral */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("guid")(x.asInstanceOf[js.Any])
    
    // Casts
    /* static member */
    @JSGlobal("jo.literal")
    @js.native
    def literal: js.Function1[/* stringLiteral */ String, String] = js.native
    inline def literal_=(x: js.Function1[/* stringLiteral */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("literal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("jo.loadLocal")
    @js.native
    def loadLocal: js.Function1[/* key */ js.UndefOr[String], typings.jodata.jo] = js.native
    inline def loadLocal_=(x: js.Function1[/* key */ js.UndefOr[String], typings.jodata.jo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadLocal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("jo.single")
    @js.native
    def single: js.Function1[/* stringLiteral */ Double, String] = js.native
    inline def single_=(x: js.Function1[/* stringLiteral */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("single")(x.asInstanceOf[js.Any])
  }
}
