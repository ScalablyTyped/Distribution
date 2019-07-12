package typings
package kytheLib.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Subkind extends js.Object

@JSImport("kythe", "Subkind")
@js.native
object Subkind extends js.Object {
  @js.native
  sealed trait CATEGORY
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait CLASS
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait CONSTRUCTOR
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait DESTRUCTOR
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait ENUM
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait ENUM_CLASS
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait FIELD
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait IMPLICIT
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait IMPORT
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait INITIALIZER
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait LOCAL
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait LOCAL_PARAMETER
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait METHOD
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait NAMESPACE
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait STRUCT
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait TYPE
    extends kytheLib.kytheMod.Subkind
  
  @js.native
  sealed trait UNION
    extends kytheLib.kytheMod.Subkind
  
  /* "category" */ val CATEGORY: CATEGORY with java.lang.String = js.native
  /* "class" */ val CLASS: CLASS with java.lang.String = js.native
  /* "constructor" */ val CONSTRUCTOR: CONSTRUCTOR with java.lang.String = js.native
  /* "destructor" */ val DESTRUCTOR: DESTRUCTOR with java.lang.String = js.native
  /* "enum" */ val ENUM: ENUM with java.lang.String = js.native
  /* "enumClass" */ val ENUM_CLASS: ENUM_CLASS with java.lang.String = js.native
  /* "field" */ val FIELD: FIELD with java.lang.String = js.native
  /* "implicit" */ val IMPLICIT: IMPLICIT with java.lang.String = js.native
  /* "import" */ val IMPORT: IMPORT with java.lang.String = js.native
  /* "initializer" */ val INITIALIZER: INITIALIZER with java.lang.String = js.native
  /* "local" */ val LOCAL: LOCAL with java.lang.String = js.native
  /* "local/parameter" */ val LOCAL_PARAMETER: LOCAL_PARAMETER with java.lang.String = js.native
  /* "method" */ val METHOD: METHOD with java.lang.String = js.native
  /* "namespace" */ val NAMESPACE: NAMESPACE with java.lang.String = js.native
  /* "struct" */ val STRUCT: STRUCT with java.lang.String = js.native
  /* "type" */ val TYPE: TYPE with java.lang.String = js.native
  /* "union" */ val UNION: UNION with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[kytheLib.kytheMod.Subkind with java.lang.String] = js.native
}

