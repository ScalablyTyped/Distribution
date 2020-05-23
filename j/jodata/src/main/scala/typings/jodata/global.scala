package typings.jodata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class jo protected ()
    extends typings.jodata.jo {
    def this(baseUri: String) = this()
  }
  
  /* static members */
  @js.native
  object jo extends js.Object {
    @js.native
    class Concat protected ()
      extends typings.jodata.jo.Concat {
      def this(value1: String, value2: String) = this()
      def this(value1: String, value2: typings.jodata.jo.Concat) = this()
      def this(value1: typings.jodata.jo.Concat, value2: String) = this()
      def this(value1: typings.jodata.jo.Concat, value2: typings.jodata.jo.Concat) = this()
      /* CompleteClass */
      override var LeftSide: String | typings.jodata.jo.Concat = js.native
      /* CompleteClass */
      override var RightSide: String | typings.jodata.jo.Concat = js.native
    }
    
    @js.native
    class FilterClause ()
      extends typings.jodata.jo.FilterClause {
      def this(property: String) = this()
    }
    
    @js.native
    class PrecedenceGroup protected ()
      extends typings.jodata.jo.PrecedenceGroup {
      def this(filterClause: typings.jodata.jo.FilterClause) = this()
      /* CompleteClass */
      override def andFilter(filterClause: typings.jodata.jo.FilterClause): typings.jodata.jo.FilterClause = js.native
      /* CompleteClass */
      override def orFilter(filterClause: typings.jodata.jo.FilterClause): typings.jodata.jo.FilterClause = js.native
    }
    
    def datetime(stringLiteral: String): String = js.native
    def decimal(stringLiteral: Double): String = js.native
    def double(stringLiteral: Double): String = js.native
    def guid(stringLiteral: String): String = js.native
    // Casts
    def literal(stringLiteral: String): String = js.native
    def loadLocal(): typings.jodata.jo = js.native
    def loadLocal(key: String): typings.jodata.jo = js.native
    def single(stringLiteral: Double): String = js.native
  }
  
}

