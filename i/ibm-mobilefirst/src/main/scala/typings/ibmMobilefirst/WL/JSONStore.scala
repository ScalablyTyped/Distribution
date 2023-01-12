package typings.ibmMobilefirst.WL

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSONStore {
  
  trait AddOptions
    extends StObject
       with Options {
    
    var additionalSearchFields: js.UndefOr[Any] = js.undefined
    
    var markDirty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated
      */
    var push: js.UndefOr[Boolean] = js.undefined
  }
  object AddOptions {
    
    inline def apply(): AddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddOptions] (val x: Self) extends AnyVal {
      
      inline def setAdditionalSearchFields(value: Any): Self = StObject.set(x, "additionalSearchFields", value.asInstanceOf[js.Any])
      
      inline def setAdditionalSearchFieldsUndefined: Self = StObject.set(x, "additionalSearchFields", js.undefined)
      
      inline def setMarkDirty(value: Boolean): Self = StObject.set(x, "markDirty", value.asInstanceOf[js.Any])
      
      inline def setMarkDirtyUndefined: Self = StObject.set(x, "markDirty", js.undefined)
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
  
  trait AdvancedFindOptions
    extends StObject
       with BasicFindOptions {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object AdvancedFindOptions {
    
    inline def apply(): AdvancedFindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdvancedFindOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdvancedFindOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait BasicFindOptions
    extends StObject
       with Options {
    
    var filter: js.UndefOr[js.Array[String]] = js.undefined
    
    var sort: js.UndefOr[js.Array[String]] = js.undefined
  }
  object BasicFindOptions {
    
    inline def apply(): BasicFindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicFindOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BasicFindOptions] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setSort(value: js.Array[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value*))
    }
  }
  
  trait ChangeOptions
    extends StObject
       with Options {
    
    var addNew: js.UndefOr[Boolean] = js.undefined
    
    var markDirty: js.UndefOr[Boolean] = js.undefined
    
    var replaceCriteria: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ChangeOptions {
    
    inline def apply(): ChangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeOptions] (val x: Self) extends AnyVal {
      
      inline def setAddNew(value: Boolean): Self = StObject.set(x, "addNew", value.asInstanceOf[js.Any])
      
      inline def setAddNewUndefined: Self = StObject.set(x, "addNew", js.undefined)
      
      inline def setMarkDirty(value: Boolean): Self = StObject.set(x, "markDirty", value.asInstanceOf[js.Any])
      
      inline def setMarkDirtyUndefined: Self = StObject.set(x, "markDirty", js.undefined)
      
      inline def setReplaceCriteria(value: js.Array[String]): Self = StObject.set(x, "replaceCriteria", value.asInstanceOf[js.Any])
      
      inline def setReplaceCriteriaUndefined: Self = StObject.set(x, "replaceCriteria", js.undefined)
      
      inline def setReplaceCriteriaVarargs(value: String*): Self = StObject.set(x, "replaceCriteria", js.Array(value*))
    }
  }
  
  trait EraseOptions
    extends StObject
       with Options {
    
    var push: js.UndefOr[Boolean] = js.undefined
  }
  object EraseOptions {
    
    inline def apply(): EraseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EraseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EraseOptions] (val x: Self) extends AnyVal {
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
  
  trait FindOptions
    extends StObject
       with BasicFindOptions {
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object FindOptions {
    
    inline def apply(): FindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindOptions] (val x: Self) extends AnyVal {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait InitOptions extends StObject {
    
    var analytics: js.UndefOr[Boolean] = js.undefined
    
    var clear: js.UndefOr[Boolean] = js.undefined
    
    var localKeyGen: js.UndefOr[Boolean] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object InitOptions {
    
    inline def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      inline def setAnalytics(value: Boolean): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
      
      inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setLocalKeyGen(value: Boolean): Self = StObject.set(x, "localKeyGen", value.asInstanceOf[js.Any])
      
      inline def setLocalKeyGenUndefined: Self = StObject.set(x, "localKeyGen", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait JSONStoreInstance extends StObject {
    
    def add(data: Any): JQueryDeferred[Any] = js.native
    def add(data: Any, options: AddOptions): JQueryDeferred[Any] = js.native
    
    def advancedFind(query: js.Array[Any]): JQueryDeferred[Any] = js.native
    def advancedFind(query: js.Array[Any], options: AdvancedFindOptions): JQueryDeferred[Any] = js.native
    
    def change(data: Any): JQueryDeferred[Any] = js.native
    def change(data: Any, options: ChangeOptions): JQueryDeferred[Any] = js.native
    
    def clear(): JQueryDeferred[Any] = js.native
    def clear(options: Options): JQueryDeferred[Any] = js.native
    
    def count(): JQueryDeferred[Any] = js.native
    def count(query: Any): JQueryDeferred[Any] = js.native
    def count(query: Any, options: Options): JQueryDeferred[Any] = js.native
    def count(query: Unit, options: Options): JQueryDeferred[Any] = js.native
    
    def countAllDirty(): JQueryDeferred[Any] = js.native
    def countAllDirty(options: Options): JQueryDeferred[Any] = js.native
    
    def enhance(name: String, fn: js.Function): Double = js.native
    
    /**
      * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.remove with {push: false}.
      */
    def erase(doc: Any): Unit = js.native
    def erase(doc: Any, options: EraseOptions): Unit = js.native
    
    def find(query: js.Array[js.Object]): JQueryDeferred[Any] = js.native
    def find(query: js.Array[js.Object], options: FindOptions): JQueryDeferred[Any] = js.native
    def find(query: js.Object): JQueryDeferred[Any] = js.native
    def find(query: js.Object, options: FindOptions): JQueryDeferred[Any] = js.native
    
    def findAll(): JQueryDeferred[Any] = js.native
    def findAll(options: BasicFindOptions): JQueryDeferred[Any] = js.native
    
    def findById(): JQueryDeferred[Any] = js.native
    def findById(options: Options): JQueryDeferred[Any] = js.native
    
    def isDirty(doc: Any): JQueryDeferred[Boolean] = js.native
    def isDirty(doc: Any, options: Options): JQueryDeferred[Boolean] = js.native
    
    /**
      * @deprecated since version 6.2.0.
      */
    def load(): JQueryDeferred[Any] = js.native
    def load(options: Options): JQueryDeferred[Any] = js.native
    
    def markClean(docs: js.Array[Any]): JQueryDeferred[Any] = js.native
    def markClean(docs: js.Array[Any], options: Options): JQueryDeferred[Any] = js.native
    
    /**
      * @deprecated since version 6.2.0.
      */
    def push(): JQueryDeferred[Any] = js.native
    def push(options: Any): JQueryDeferred[Any] = js.native
    
    /**
      * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.push.
      */
    def pushSelected(doc: Any): JQueryDeferred[Any] = js.native
    def pushSelected(doc: Any, options: Options): JQueryDeferred[Any] = js.native
    
    /**
      * @deprecated since version 5.0.6. It is no longer needed if you use WL.JSONStore.JSONStoreInstance.replace with {push: false}.
      */
    def refresh(doc: Any): JQueryDeferred[Any] = js.native
    def refresh(doc: Any, options: RefreshOptions): JQueryDeferred[Any] = js.native
    
    def remove(doc: Any): JQueryDeferred[Any] = js.native
    def remove(doc: Any, options: RemoveOptions): JQueryDeferred[Any] = js.native
    
    /**
      * Deletes all the documents that are stored inside a collection.
      */
    def removeCollection(): JQueryDeferred[Any] = js.native
    def removeCollection(options: Options): JQueryDeferred[Any] = js.native
    
    def replace(doc: js.Array[js.Object]): JQueryDeferred[Any] = js.native
    def replace(doc: js.Array[js.Object], options: ReplaceOptions): JQueryDeferred[Any] = js.native
    def replace(doc: js.Object): JQueryDeferred[Any] = js.native
    def replace(doc: js.Object, options: ReplaceOptions): JQueryDeferred[Any] = js.native
    
    def store(data: js.Array[js.Object]): Unit = js.native
    def store(data: js.Array[js.Object], options: StoreOptions): Unit = js.native
    /**
      * Writes data to a collection.
      * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.add with {push: false}.
      */
    def store(data: js.Object): Unit = js.native
    def store(data: js.Object, options: StoreOptions): Unit = js.native
    
    def toString(limit: Double): JQueryDeferred[Double] = js.native
    def toString(limit: Double, offset: Double): JQueryDeferred[Double] = js.native
    def toString(limit: Unit, offset: Double): JQueryDeferred[Double] = js.native
  }
  
  trait QueryPartObj extends StObject {
    
    /**
      * Add a between clause to a query for advanced find.
      */
    def between(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add an equal to clause to a query for advanced find.
      */
    def equal(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a greater or equal thanclause to a query for advanced find.
      */
    def greaterOrEqualThan(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a greater than clause to a query for advanced find.
      */
    def greaterThan(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add an in clause to a query for advanced find.
      */
    def inside(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a left clause to a query for advanced find.
      */
    def leftLike(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a less or equal than clause to a query for advanced find.
      */
    def lessOrEqualThan(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a less than clause to a query for advanced find.
      */
    def lessThan(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a like clause to a query for advanced find.
      */
    def like(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a not between clause to a query for advanced find.
      */
    def notBetween(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a not equal to clause to a query for advanced find.
      */
    def notEqual(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a not in clause to a query for advanced find.
      */
    def notInside(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a not left clause to a query for advanced find.
      */
    def notLeftLike(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a not like clause to a query for advanced find.
      */
    def notLike(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a not right clause to a query for advanced find.
      */
    def notRightLike(searchField: Any, value: Any): js.Array[Any]
    
    /**
      * Add a right clause to a query for advanced find.
      */
    def rightLike(searchField: Any, value: Any): js.Array[Any]
  }
  object QueryPartObj {
    
    inline def apply(
      between: (Any, Any) => js.Array[Any],
      equal: (Any, Any) => js.Array[Any],
      greaterOrEqualThan: (Any, Any) => js.Array[Any],
      greaterThan: (Any, Any) => js.Array[Any],
      inside: (Any, Any) => js.Array[Any],
      leftLike: (Any, Any) => js.Array[Any],
      lessOrEqualThan: (Any, Any) => js.Array[Any],
      lessThan: (Any, Any) => js.Array[Any],
      like: (Any, Any) => js.Array[Any],
      notBetween: (Any, Any) => js.Array[Any],
      notEqual: (Any, Any) => js.Array[Any],
      notInside: (Any, Any) => js.Array[Any],
      notLeftLike: (Any, Any) => js.Array[Any],
      notLike: (Any, Any) => js.Array[Any],
      notRightLike: (Any, Any) => js.Array[Any],
      rightLike: (Any, Any) => js.Array[Any]
    ): QueryPartObj = {
      val __obj = js.Dynamic.literal(between = js.Any.fromFunction2(between), equal = js.Any.fromFunction2(equal), greaterOrEqualThan = js.Any.fromFunction2(greaterOrEqualThan), greaterThan = js.Any.fromFunction2(greaterThan), inside = js.Any.fromFunction2(inside), leftLike = js.Any.fromFunction2(leftLike), lessOrEqualThan = js.Any.fromFunction2(lessOrEqualThan), lessThan = js.Any.fromFunction2(lessThan), like = js.Any.fromFunction2(like), notBetween = js.Any.fromFunction2(notBetween), notEqual = js.Any.fromFunction2(notEqual), notInside = js.Any.fromFunction2(notInside), notLeftLike = js.Any.fromFunction2(notLeftLike), notLike = js.Any.fromFunction2(notLike), notRightLike = js.Any.fromFunction2(notRightLike), rightLike = js.Any.fromFunction2(rightLike))
      __obj.asInstanceOf[QueryPartObj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryPartObj] (val x: Self) extends AnyVal {
      
      inline def setBetween(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "between", js.Any.fromFunction2(value))
      
      inline def setEqual(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      inline def setGreaterOrEqualThan(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "greaterOrEqualThan", js.Any.fromFunction2(value))
      
      inline def setGreaterThan(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "greaterThan", js.Any.fromFunction2(value))
      
      inline def setInside(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "inside", js.Any.fromFunction2(value))
      
      inline def setLeftLike(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "leftLike", js.Any.fromFunction2(value))
      
      inline def setLessOrEqualThan(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "lessOrEqualThan", js.Any.fromFunction2(value))
      
      inline def setLessThan(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "lessThan", js.Any.fromFunction2(value))
      
      inline def setLike(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "like", js.Any.fromFunction2(value))
      
      inline def setNotBetween(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "notBetween", js.Any.fromFunction2(value))
      
      inline def setNotEqual(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "notEqual", js.Any.fromFunction2(value))
      
      inline def setNotInside(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "notInside", js.Any.fromFunction2(value))
      
      inline def setNotLeftLike(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "notLeftLike", js.Any.fromFunction2(value))
      
      inline def setNotLike(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "notLike", js.Any.fromFunction2(value))
      
      inline def setNotRightLike(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "notRightLike", js.Any.fromFunction2(value))
      
      inline def setRightLike(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "rightLike", js.Any.fromFunction2(value))
    }
  }
  
  trait RefreshOptions
    extends StObject
       with Options {
    
    var push: Boolean
  }
  object RefreshOptions {
    
    inline def apply(push: Boolean): RefreshOptions = {
      val __obj = js.Dynamic.literal(push = push.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefreshOptions] (val x: Self) extends AnyVal {
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveOptions
    extends StObject
       with Options {
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var markDirty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated
      */
    var push: js.UndefOr[Boolean] = js.undefined
  }
  object RemoveOptions {
    
    inline def apply(): RemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveOptions] (val x: Self) extends AnyVal {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setMarkDirty(value: Boolean): Self = StObject.set(x, "markDirty", value.asInstanceOf[js.Any])
      
      inline def setMarkDirtyUndefined: Self = StObject.set(x, "markDirty", js.undefined)
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
  
  trait ReplaceOptions
    extends StObject
       with Options {
    
    var markDirty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated
      */
    var push: js.UndefOr[Boolean] = js.undefined
  }
  object ReplaceOptions {
    
    inline def apply(): ReplaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplaceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
      
      inline def setMarkDirty(value: Boolean): Self = StObject.set(x, "markDirty", value.asInstanceOf[js.Any])
      
      inline def setMarkDirtyUndefined: Self = StObject.set(x, "markDirty", js.undefined)
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
  
  trait StoreOptions
    extends StObject
       with Options {
    
    var additionalSearchFields: js.UndefOr[js.Object] = js.undefined
    
    var push: js.UndefOr[Boolean] = js.undefined
  }
  object StoreOptions {
    
    inline def apply(): StoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoreOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoreOptions] (val x: Self) extends AnyVal {
      
      inline def setAdditionalSearchFields(value: js.Object): Self = StObject.set(x, "additionalSearchFields", value.asInstanceOf[js.Any])
      
      inline def setAdditionalSearchFieldsUndefined: Self = StObject.set(x, "additionalSearchFields", js.undefined)
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
}
