package typings.kythe.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Subkind extends js.Object

@JSImport("kythe", "Subkind")
@js.native
object Subkind extends js.Object {
  @js.native
  sealed trait CATEGORY extends Subkind
  
  @js.native
  sealed trait CLASS extends Subkind
  
  @js.native
  sealed trait CONSTRUCTOR extends Subkind
  
  @js.native
  sealed trait DESTRUCTOR extends Subkind
  
  @js.native
  sealed trait ENUM extends Subkind
  
  @js.native
  sealed trait ENUM_CLASS extends Subkind
  
  @js.native
  sealed trait FIELD extends Subkind
  
  @js.native
  sealed trait IMPLICIT extends Subkind
  
  @js.native
  sealed trait IMPORT extends Subkind
  
  @js.native
  sealed trait INITIALIZER extends Subkind
  
  @js.native
  sealed trait LOCAL extends Subkind
  
  @js.native
  sealed trait LOCAL_PARAMETER extends Subkind
  
  @js.native
  sealed trait METHOD extends Subkind
  
  @js.native
  sealed trait NAMESPACE extends Subkind
  
  @js.native
  sealed trait STRUCT extends Subkind
  
  @js.native
  sealed trait TYPE extends Subkind
  
  @js.native
  sealed trait UNION extends Subkind
  
  /* "category" */ val CATEGORY: typings.kythe.kytheMod.Subkind.CATEGORY with String = js.native
  /* "class" */ val CLASS: typings.kythe.kytheMod.Subkind.CLASS with String = js.native
  /* "constructor" */ val CONSTRUCTOR: typings.kythe.kytheMod.Subkind.CONSTRUCTOR with String = js.native
  /* "destructor" */ val DESTRUCTOR: typings.kythe.kytheMod.Subkind.DESTRUCTOR with String = js.native
  /* "enum" */ val ENUM: typings.kythe.kytheMod.Subkind.ENUM with String = js.native
  /* "enumClass" */ val ENUM_CLASS: typings.kythe.kytheMod.Subkind.ENUM_CLASS with String = js.native
  /* "field" */ val FIELD: typings.kythe.kytheMod.Subkind.FIELD with String = js.native
  /* "implicit" */ val IMPLICIT: typings.kythe.kytheMod.Subkind.IMPLICIT with String = js.native
  /* "import" */ val IMPORT: typings.kythe.kytheMod.Subkind.IMPORT with String = js.native
  /* "initializer" */ val INITIALIZER: typings.kythe.kytheMod.Subkind.INITIALIZER with String = js.native
  /* "local" */ val LOCAL: typings.kythe.kytheMod.Subkind.LOCAL with String = js.native
  /* "local/parameter" */ val LOCAL_PARAMETER: typings.kythe.kytheMod.Subkind.LOCAL_PARAMETER with String = js.native
  /* "method" */ val METHOD: typings.kythe.kytheMod.Subkind.METHOD with String = js.native
  /* "namespace" */ val NAMESPACE: typings.kythe.kytheMod.Subkind.NAMESPACE with String = js.native
  /* "struct" */ val STRUCT: typings.kythe.kytheMod.Subkind.STRUCT with String = js.native
  /* "type" */ val TYPE: typings.kythe.kytheMod.Subkind.TYPE with String = js.native
  /* "union" */ val UNION: typings.kythe.kytheMod.Subkind.UNION with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Subkind with String] = js.native
}

