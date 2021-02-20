package typings.ibmMobilefirst.WL

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSONStore {
  
  @js.native
  trait AddOptions extends Options {
    
    var additionalSearchFields: js.UndefOr[js.Any] = js.native
    
    var markDirty: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated
      */
    var push: js.UndefOr[Boolean] = js.native
  }
  object AddOptions {
    
    @scala.inline
    def apply(): AddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOptions]
    }
    
    @scala.inline
    implicit class AddOptionsMutableBuilder[Self <: AddOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalSearchFields(value: js.Any): Self = StObject.set(x, "additionalSearchFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalSearchFieldsUndefined: Self = StObject.set(x, "additionalSearchFields", js.undefined)
      
      @scala.inline
      def setMarkDirty(value: Boolean): Self = StObject.set(x, "markDirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkDirtyUndefined: Self = StObject.set(x, "markDirty", js.undefined)
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
  
  @js.native
  trait AdvancedFindOptions extends BasicFindOptions {
    
    var limit: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
  object AdvancedFindOptions {
    
    @scala.inline
    def apply(): AdvancedFindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdvancedFindOptions]
    }
    
    @scala.inline
    implicit class AdvancedFindOptionsMutableBuilder[Self <: AdvancedFindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait BasicFindOptions extends Options {
    
    var filter: js.UndefOr[js.Array[String]] = js.native
    
    var sort: js.UndefOr[js.Array[String]] = js.native
  }
  object BasicFindOptions {
    
    @scala.inline
    def apply(): BasicFindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicFindOptions]
    }
    
    @scala.inline
    implicit class BasicFindOptionsMutableBuilder[Self <: BasicFindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setSort(value: js.Array[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ChangeOptions extends Options {
    
    var addNew: js.UndefOr[Boolean] = js.native
    
    var markDirty: js.UndefOr[Boolean] = js.native
    
    var replaceCriteria: js.UndefOr[js.Array[String]] = js.native
  }
  object ChangeOptions {
    
    @scala.inline
    def apply(): ChangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeOptions]
    }
    
    @scala.inline
    implicit class ChangeOptionsMutableBuilder[Self <: ChangeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddNew(value: Boolean): Self = StObject.set(x, "addNew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddNewUndefined: Self = StObject.set(x, "addNew", js.undefined)
      
      @scala.inline
      def setMarkDirty(value: Boolean): Self = StObject.set(x, "markDirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkDirtyUndefined: Self = StObject.set(x, "markDirty", js.undefined)
      
      @scala.inline
      def setReplaceCriteria(value: js.Array[String]): Self = StObject.set(x, "replaceCriteria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceCriteriaUndefined: Self = StObject.set(x, "replaceCriteria", js.undefined)
      
      @scala.inline
      def setReplaceCriteriaVarargs(value: String*): Self = StObject.set(x, "replaceCriteria", js.Array(value :_*))
    }
  }
  
  @js.native
  trait EraseOptions extends Options {
    
    var push: js.UndefOr[Boolean] = js.native
  }
  object EraseOptions {
    
    @scala.inline
    def apply(): EraseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EraseOptions]
    }
    
    @scala.inline
    implicit class EraseOptionsMutableBuilder[Self <: EraseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
  
  @js.native
  trait FindOptions extends BasicFindOptions {
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
  object FindOptions {
    
    @scala.inline
    def apply(): FindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions]
    }
    
    @scala.inline
    implicit class FindOptionsMutableBuilder[Self <: FindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait InitOptions extends StObject {
    
    var analytics: js.UndefOr[Boolean] = js.native
    
    var clear: js.UndefOr[Boolean] = js.native
    
    var localKeyGen: js.UndefOr[Boolean] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object InitOptions {
    
    @scala.inline
    def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalytics(value: Boolean): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
      
      @scala.inline
      def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setLocalKeyGen(value: Boolean): Self = StObject.set(x, "localKeyGen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalKeyGenUndefined: Self = StObject.set(x, "localKeyGen", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait JSONStoreInstance extends StObject {
    
    def add(data: js.Any): JQueryDeferred[_] = js.native
    def add(data: js.Any, options: AddOptions): JQueryDeferred[_] = js.native
    
    def advancedFind(query: js.Array[_]): JQueryDeferred[_] = js.native
    def advancedFind(query: js.Array[_], options: AdvancedFindOptions): JQueryDeferred[_] = js.native
    
    def change(data: js.Any): JQueryDeferred[_] = js.native
    def change(data: js.Any, options: ChangeOptions): JQueryDeferred[_] = js.native
    
    def clear(): JQueryDeferred[_] = js.native
    def clear(options: Options): JQueryDeferred[_] = js.native
    
    def count(): JQueryDeferred[_] = js.native
    def count(query: js.UndefOr[scala.Nothing], options: Options): JQueryDeferred[_] = js.native
    def count(query: js.Any): JQueryDeferred[_] = js.native
    def count(query: js.Any, options: Options): JQueryDeferred[_] = js.native
    
    def countAllDirty(): JQueryDeferred[_] = js.native
    def countAllDirty(options: Options): JQueryDeferred[_] = js.native
    
    def enhance(name: String, fn: js.Function): Double = js.native
    
    /**
      * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.remove with {push: false}.
      */
    def erase(doc: js.Any): Unit = js.native
    def erase(doc: js.Any, options: EraseOptions): Unit = js.native
    
    def find(query: js.Array[js.Object]): JQueryDeferred[_] = js.native
    def find(query: js.Array[js.Object], options: FindOptions): JQueryDeferred[_] = js.native
    def find(query: js.Object): JQueryDeferred[_] = js.native
    def find(query: js.Object, options: FindOptions): JQueryDeferred[_] = js.native
    
    def findAll(): JQueryDeferred[_] = js.native
    def findAll(options: BasicFindOptions): JQueryDeferred[_] = js.native
    
    def findById(): JQueryDeferred[_] = js.native
    def findById(options: Options): JQueryDeferred[_] = js.native
    
    def isDirty(doc: js.Any): JQueryDeferred[Boolean] = js.native
    def isDirty(doc: js.Any, options: Options): JQueryDeferred[Boolean] = js.native
    
    /**
      * @deprecated since version 6.2.0.
      */
    def load(): JQueryDeferred[_] = js.native
    def load(options: Options): JQueryDeferred[_] = js.native
    
    def markClean(docs: js.Array[_]): JQueryDeferred[_] = js.native
    def markClean(docs: js.Array[_], options: Options): JQueryDeferred[_] = js.native
    
    /**
      * @deprecated since version 6.2.0.
      */
    def push(): JQueryDeferred[_] = js.native
    def push(options: js.Any): JQueryDeferred[_] = js.native
    
    /**
      * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.push.
      */
    def pushSelected(doc: js.Any): JQueryDeferred[_] = js.native
    def pushSelected(doc: js.Any, options: Options): JQueryDeferred[_] = js.native
    
    /**
      * @deprecated since version 5.0.6. It is no longer needed if you use WL.JSONStore.JSONStoreInstance.replace with {push: false}.
      */
    def refresh(doc: js.Any): JQueryDeferred[_] = js.native
    def refresh(doc: js.Any, options: RefreshOptions): JQueryDeferred[_] = js.native
    
    def remove(doc: js.Any): JQueryDeferred[_] = js.native
    def remove(doc: js.Any, options: RemoveOptions): JQueryDeferred[_] = js.native
    
    /**
      * Deletes all the documents that are stored inside a collection.
      */
    def removeCollection(): JQueryDeferred[_] = js.native
    def removeCollection(options: Options): JQueryDeferred[_] = js.native
    
    def replace(doc: js.Array[js.Object]): JQueryDeferred[_] = js.native
    def replace(doc: js.Array[js.Object], options: ReplaceOptions): JQueryDeferred[_] = js.native
    def replace(doc: js.Object): JQueryDeferred[_] = js.native
    def replace(doc: js.Object, options: ReplaceOptions): JQueryDeferred[_] = js.native
    
    def store(data: js.Array[js.Object]): Unit = js.native
    def store(data: js.Array[js.Object], options: StoreOptions): Unit = js.native
    /**
      * Writes data to a collection.
      * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.add with {push: false}.
      */
    def store(data: js.Object): Unit = js.native
    def store(data: js.Object, options: StoreOptions): Unit = js.native
    
    def toString(limit: js.UndefOr[scala.Nothing], offset: Double): JQueryDeferred[Double] = js.native
    def toString(limit: Double): JQueryDeferred[Double] = js.native
    def toString(limit: Double, offset: Double): JQueryDeferred[Double] = js.native
  }
  
  @js.native
  trait QueryPartObj extends StObject {
    
    /**
      * Add a between clause to a query for advanced find.
      */
    def between(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add an equal to clause to a query for advanced find.
      */
    def equal(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a greater or equal thanclause to a query for advanced find.
      */
    def greaterOrEqualThan(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a greater than clause to a query for advanced find.
      */
    def greaterThan(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add an in clause to a query for advanced find.
      */
    def inside(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a left clause to a query for advanced find.
      */
    def leftLike(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a less or equal than clause to a query for advanced find.
      */
    def lessOrEqualThan(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a less than clause to a query for advanced find.
      */
    def lessThan(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a like clause to a query for advanced find.
      */
    def like(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a not between clause to a query for advanced find.
      */
    def notBetween(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a not equal to clause to a query for advanced find.
      */
    def notEqual(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a not in clause to a query for advanced find.
      */
    def notInside(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a not left clause to a query for advanced find.
      */
    def notLeftLike(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a not like clause to a query for advanced find.
      */
    def notLike(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a not right clause to a query for advanced find.
      */
    def notRightLike(searchField: js.Any, value: js.Any): js.Array[_] = js.native
    
    /**
      * Add a right clause to a query for advanced find.
      */
    def rightLike(searchField: js.Any, value: js.Any): js.Array[_] = js.native
  }
  object QueryPartObj {
    
    @scala.inline
    def apply(
      between: (js.Any, js.Any) => js.Array[_],
      equal: (js.Any, js.Any) => js.Array[_],
      greaterOrEqualThan: (js.Any, js.Any) => js.Array[_],
      greaterThan: (js.Any, js.Any) => js.Array[_],
      inside: (js.Any, js.Any) => js.Array[_],
      leftLike: (js.Any, js.Any) => js.Array[_],
      lessOrEqualThan: (js.Any, js.Any) => js.Array[_],
      lessThan: (js.Any, js.Any) => js.Array[_],
      like: (js.Any, js.Any) => js.Array[_],
      notBetween: (js.Any, js.Any) => js.Array[_],
      notEqual: (js.Any, js.Any) => js.Array[_],
      notInside: (js.Any, js.Any) => js.Array[_],
      notLeftLike: (js.Any, js.Any) => js.Array[_],
      notLike: (js.Any, js.Any) => js.Array[_],
      notRightLike: (js.Any, js.Any) => js.Array[_],
      rightLike: (js.Any, js.Any) => js.Array[_]
    ): QueryPartObj = {
      val __obj = js.Dynamic.literal(between = js.Any.fromFunction2(between), equal = js.Any.fromFunction2(equal), greaterOrEqualThan = js.Any.fromFunction2(greaterOrEqualThan), greaterThan = js.Any.fromFunction2(greaterThan), inside = js.Any.fromFunction2(inside), leftLike = js.Any.fromFunction2(leftLike), lessOrEqualThan = js.Any.fromFunction2(lessOrEqualThan), lessThan = js.Any.fromFunction2(lessThan), like = js.Any.fromFunction2(like), notBetween = js.Any.fromFunction2(notBetween), notEqual = js.Any.fromFunction2(notEqual), notInside = js.Any.fromFunction2(notInside), notLeftLike = js.Any.fromFunction2(notLeftLike), notLike = js.Any.fromFunction2(notLike), notRightLike = js.Any.fromFunction2(notRightLike), rightLike = js.Any.fromFunction2(rightLike))
      __obj.asInstanceOf[QueryPartObj]
    }
    
    @scala.inline
    implicit class QueryPartObjMutableBuilder[Self <: QueryPartObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBetween(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "between", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEqual(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGreaterOrEqualThan(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "greaterOrEqualThan", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGreaterThan(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "greaterThan", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInside(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "inside", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeftLike(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "leftLike", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLessOrEqualThan(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "lessOrEqualThan", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLessThan(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "lessThan", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLike(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "like", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotBetween(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "notBetween", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotEqual(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "notEqual", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotInside(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "notInside", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotLeftLike(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "notLeftLike", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotLike(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "notLike", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotRightLike(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "notRightLike", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRightLike(value: (js.Any, js.Any) => js.Array[_]): Self = StObject.set(x, "rightLike", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait RefreshOptions extends Options {
    
    var push: Boolean = js.native
  }
  object RefreshOptions {
    
    @scala.inline
    def apply(push: Boolean): RefreshOptions = {
      val __obj = js.Dynamic.literal(push = push.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshOptions]
    }
    
    @scala.inline
    implicit class RefreshOptionsMutableBuilder[Self <: RefreshOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoveOptions extends Options {
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var markDirty: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated
      */
    var push: js.UndefOr[Boolean] = js.native
  }
  object RemoveOptions {
    
    @scala.inline
    def apply(): RemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveOptions]
    }
    
    @scala.inline
    implicit class RemoveOptionsMutableBuilder[Self <: RemoveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setMarkDirty(value: Boolean): Self = StObject.set(x, "markDirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkDirtyUndefined: Self = StObject.set(x, "markDirty", js.undefined)
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
  
  @js.native
  trait ReplaceOptions extends Options {
    
    var markDirty: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated
      */
    var push: js.UndefOr[Boolean] = js.native
  }
  object ReplaceOptions {
    
    @scala.inline
    def apply(): ReplaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplaceOptions]
    }
    
    @scala.inline
    implicit class ReplaceOptionsMutableBuilder[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarkDirty(value: Boolean): Self = StObject.set(x, "markDirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkDirtyUndefined: Self = StObject.set(x, "markDirty", js.undefined)
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
  
  @js.native
  trait StoreOptions extends Options {
    
    var additionalSearchFields: js.UndefOr[js.Object] = js.native
    
    var push: js.UndefOr[Boolean] = js.native
  }
  object StoreOptions {
    
    @scala.inline
    def apply(): StoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoreOptions]
    }
    
    @scala.inline
    implicit class StoreOptionsMutableBuilder[Self <: StoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalSearchFields(value: js.Object): Self = StObject.set(x, "additionalSearchFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalSearchFieldsUndefined: Self = StObject.set(x, "additionalSearchFields", js.undefined)
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
}
