package typings.keenTracking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base extends StObject {
    
    var base: String
    
    var events: String
    
    var projectId: String
    
    var projects: String
    
    var queries: String
    
    var version: String
  }
  object Base {
    
    inline def apply(
      base: String,
      events: String,
      projectId: String,
      projects: String,
      queries: String,
      version: String
    ): Base = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: String): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setQueries(value: String): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Capacity extends StObject {
    
    var capacity: Double
    
    var interval: Double
  }
  object Capacity {
    
    inline def apply(capacity: Double, interval: Double): Capacity = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capacity]
    }
    
    extension [Self <: Capacity](x: Self) {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
  
  trait Collections extends StObject {
    
    var events: js.Array[js.Object]
  }
  object Collections {
    
    inline def apply(events: js.Array[js.Object]): Collections = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collections]
    }
    
    extension [Self <: Collections](x: Self) {
      
      inline def setEvents(value: js.Array[js.Object]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: js.Object*): Self = StObject.set(x, "events", js.Array(value*))
    }
  }
  
  trait Config extends StObject {
    
    var capacity: Double
    
    var config: Capacity
    
    var interval: Double
    
    var timer: Any
  }
  object Config {
    
    inline def apply(capacity: Double, config: Capacity, interval: Double, timer: Any): Config = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Capacity): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setTimer(value: Any): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    }
  }
  
  trait Created extends StObject {
    
    var created: Boolean
  }
  object Created {
    
    inline def apply(created: Boolean): Created = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    extension [Self <: Created](x: Self) {
      
      inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var host: String
    
    var projectId: String
    
    var protocol: String
    
    var requestType: String
    
    var resources: Base
    
    var writeKey: String
  }
  object Host {
    
    inline def apply(
      host: String,
      projectId: String,
      protocol: String,
      requestType: String,
      resources: Base,
      writeKey: String
    ): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], writeKey = writeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setResources(value: Base): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setWriteKey(value: String): Self = StObject.set(x, "writeKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectId extends StObject {
    
    var projectId: String
    
    var requestType: js.UndefOr[String] = js.undefined
    
    var writeKey: String
  }
  object ProjectId {
    
    inline def apply(projectId: String, writeKey: String): ProjectId = {
      val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], writeKey = writeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectId]
    }
    
    extension [Self <: ProjectId](x: Self) {
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setWriteKey(value: String): Self = StObject.set(x, "writeKey", value.asInstanceOf[js.Any])
    }
  }
}
