package typings.ibmMobilefirst.WL

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSONStore {
  
  trait AddOptions
    extends StObject
       with Options {
    
    var additionalSearchFields: js.UndefOr[js.Any] = js.undefined
    
    var markDirty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated
      */
    var push: js.UndefOr[Boolean] = js.undefined
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
  
  trait AdvancedFindOptions
    extends StObject
       with BasicFindOptions {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
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
  
  trait BasicFindOptions
    extends StObject
       with Options {
    
    var filter: js.UndefOr[js.Array[String]] = js.undefined
    
    var sort: js.UndefOr[js.Array[String]] = js.undefined
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
  
  trait ChangeOptions
    extends StObject
       with Options {
    
    var addNew: js.UndefOr[Boolean] = js.undefined
    
    var markDirty: js.UndefOr[Boolean] = js.undefined
    
    var replaceCriteria: js.UndefOr[js.Array[String]] = js.undefined
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
  
  trait EraseOptions
    extends StObject
       with Options {
    
    var push: js.UndefOr[Boolean] = js.undefined
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
  
  trait FindOptions
    extends StObject
       with BasicFindOptions {
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
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
  
  trait InitOptions extends StObject {
    
    var analytics: js.UndefOr[Boolean] = js.undefined
    
    var clear: js.UndefOr[Boolean] = js.undefined
    
    var localKeyGen: js.UndefOr[Boolean] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
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
    
    def add(data: js.Any): JQueryDeferred[js.Any] = js.native
    def add(data: js.Any, options: AddOptions): JQueryDeferred[js.Any] = js.native
    
    def advancedFind(query: js.Array[js.Any]): JQueryDeferred[js.Any] = js.native
    def advancedFind(query: js.Array[js.Any], options: AdvancedFindOptions): JQueryDeferred[js.Any] = js.native
    
    def change(data: js.Any): JQueryDeferred[js.Any] = js.native
    def change(data: js.Any, options: ChangeOptions): JQueryDeferred[js.Any] = js.native
    
    def clear(): JQueryDeferred[js.Any] = js.native
    def clear(options: Options): JQueryDeferred[js.Any] = js.native
    
    def count(): JQueryDeferred[js.Any] = js.native
    def count(query: js.Any): JQueryDeferred[js.Any] = js.native
    def count(query: js.Any, options: Options): JQueryDeferred[js.Any] = js.native
    def count(query: Unit, options: Options): JQueryDeferred[js.Any] = js.native
    
    def countAllDirty(): JQueryDeferred[js.Any] = js.native
    def countAllDirty(options: Options): JQueryDeferred[js.Any] = js.native
    
    def enhance(name: String, fn: js.Function): Double = js.native
    
    /**
      * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.remove with {push: false}.
      */
    def erase(doc: js.Any): Unit = js.native
    def erase(doc: js.Any, options: EraseOptions): Unit = js.native
    
    def find(query: js.Array[js.Object]): JQueryDeferred[js.Any] = js.native
    def find(query: js.Array[js.Object], options: FindOptions): JQueryDeferred[js.Any] = js.native
    def find(query: js.Object): JQueryDeferred[js.Any] = js.native
    def find(query: js.Object, options: FindOptions): JQueryDeferred[js.Any] = js.native
    
    def findAll(): JQueryDeferred[js.Any] = js.native
    def findAll(options: BasicFindOptions): JQueryDeferred[js.Any] = js.native
    
    def findById(): JQueryDeferred[js.Any] = js.native
    def findById(options: Options): JQueryDeferred[js.Any] = js.native
    
    def isDirty(doc: js.Any): JQueryDeferred[Boolean] = js.native
    def isDirty(doc: js.Any, options: Options): JQueryDeferred[Boolean] = js.native
    
    /**
      * @deprecated since version 6.2.0.
      */
    def load(): JQueryDeferred[js.Any] = js.native
    def load(options: Options): JQueryDeferred[js.Any] = js.native
    
    def markClean(docs: js.Array[js.Any]): JQueryDeferred[js.Any] = js.native
    def markClean(docs: js.Array[js.Any], options: Options): JQueryDeferred[js.Any] = js.native
    
    /**
      * @deprecated since version 6.2.0.
      */
    def push(): JQueryDeferred[js.Any] = js.native
    def push(options: js.Any): JQueryDeferred[js.Any] = js.native
    
    /**
      * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.push.
      */
    def pushSelected(doc: js.Any): JQueryDeferred[js.Any] = js.native
    def pushSelected(doc: js.Any, options: Options): JQueryDeferred[js.Any] = js.native
    
    /**
      * @deprecated since version 5.0.6. It is no longer needed if you use WL.JSONStore.JSONStoreInstance.replace with {push: false}.
      */
    def refresh(doc: js.Any): JQueryDeferred[js.Any] = js.native
    def refresh(doc: js.Any, options: RefreshOptions): JQueryDeferred[js.Any] = js.native
    
    def remove(doc: js.Any): JQueryDeferred[js.Any] = js.native
    def remove(doc: js.Any, options: RemoveOptions): JQueryDeferred[js.Any] = js.native
    
    /**
      * Deletes all the documents that are stored inside a collection.
      */
    def removeCollection(): JQueryDeferred[js.Any] = js.native
    def removeCollection(options: Options): JQueryDeferred[js.Any] = js.native
    
    def replace(doc: js.Array[js.Object]): JQueryDeferred[js.Any] = js.native
    def replace(doc: js.Array[js.Object], options: ReplaceOptions): JQueryDeferred[js.Any] = js.native
    def replace(doc: js.Object): JQueryDeferred[js.Any] = js.native
    def replace(doc: js.Object, options: ReplaceOptions): JQueryDeferred[js.Any] = js.native
    
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
    def between(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add an equal to clause to a query for advanced find.
      */
    def equal(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a greater or equal thanclause to a query for advanced find.
      */
    def greaterOrEqualThan(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a greater than clause to a query for advanced find.
      */
    def greaterThan(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add an in clause to a query for advanced find.
      */
    def inside(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a left clause to a query for advanced find.
      */
    def leftLike(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a less or equal than clause to a query for advanced find.
      */
    def lessOrEqualThan(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a less than clause to a query for advanced find.
      */
    def lessThan(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a like clause to a query for advanced find.
      */
    def like(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a not between clause to a query for advanced find.
      */
    def notBetween(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a not equal to clause to a query for advanced find.
      */
    def notEqual(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a not in clause to a query for advanced find.
      */
    def notInside(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a not left clause to a query for advanced find.
      */
    def notLeftLike(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a not like clause to a query for advanced find.
      */
    def notLike(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a not right clause to a query for advanced find.
      */
    def notRightLike(searchField: js.Any, value: js.Any): js.Array[js.Any]
    
    /**
      * Add a right clause to a query for advanced find.
      */
    def rightLike(searchField: js.Any, value: js.Any): js.Array[js.Any]
  }
  object QueryPartObj {
    
    @scala.inline
    def apply(
      between: (js.Any, js.Any) => js.Array[js.Any],
      equal: (js.Any, js.Any) => js.Array[js.Any],
      greaterOrEqualThan: (js.Any, js.Any) => js.Array[js.Any],
      greaterThan: (js.Any, js.Any) => js.Array[js.Any],
      inside: (js.Any, js.Any) => js.Array[js.Any],
      leftLike: (js.Any, js.Any) => js.Array[js.Any],
      lessOrEqualThan: (js.Any, js.Any) => js.Array[js.Any],
      lessThan: (js.Any, js.Any) => js.Array[js.Any],
      like: (js.Any, js.Any) => js.Array[js.Any],
      notBetween: (js.Any, js.Any) => js.Array[js.Any],
      notEqual: (js.Any, js.Any) => js.Array[js.Any],
      notInside: (js.Any, js.Any) => js.Array[js.Any],
      notLeftLike: (js.Any, js.Any) => js.Array[js.Any],
      notLike: (js.Any, js.Any) => js.Array[js.Any],
      notRightLike: (js.Any, js.Any) => js.Array[js.Any],
      rightLike: (js.Any, js.Any) => js.Array[js.Any]
    ): QueryPartObj = {
      val __obj = js.Dynamic.literal(between = js.Any.fromFunction2(between), equal = js.Any.fromFunction2(equal), greaterOrEqualThan = js.Any.fromFunction2(greaterOrEqualThan), greaterThan = js.Any.fromFunction2(greaterThan), inside = js.Any.fromFunction2(inside), leftLike = js.Any.fromFunction2(leftLike), lessOrEqualThan = js.Any.fromFunction2(lessOrEqualThan), lessThan = js.Any.fromFunction2(lessThan), like = js.Any.fromFunction2(like), notBetween = js.Any.fromFunction2(notBetween), notEqual = js.Any.fromFunction2(notEqual), notInside = js.Any.fromFunction2(notInside), notLeftLike = js.Any.fromFunction2(notLeftLike), notLike = js.Any.fromFunction2(notLike), notRightLike = js.Any.fromFunction2(notRightLike), rightLike = js.Any.fromFunction2(rightLike))
      __obj.asInstanceOf[QueryPartObj]
    }
    
    @scala.inline
    implicit class QueryPartObjMutableBuilder[Self <: QueryPartObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBetween(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "between", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEqual(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGreaterOrEqualThan(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "greaterOrEqualThan", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGreaterThan(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "greaterThan", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInside(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "inside", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeftLike(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "leftLike", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLessOrEqualThan(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "lessOrEqualThan", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLessThan(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "lessThan", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLike(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "like", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotBetween(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "notBetween", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotEqual(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "notEqual", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotInside(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "notInside", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotLeftLike(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "notLeftLike", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotLike(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "notLike", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotRightLike(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "notRightLike", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRightLike(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "rightLike", js.Any.fromFunction2(value))
    }
  }
  
  trait RefreshOptions
    extends StObject
       with Options {
    
    var push: Boolean
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
  
  trait StoreOptions
    extends StObject
       with Options {
    
    var additionalSearchFields: js.UndefOr[js.Object] = js.undefined
    
    var push: js.UndefOr[Boolean] = js.undefined
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
