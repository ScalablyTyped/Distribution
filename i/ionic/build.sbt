organization := "org.scalablytyped"
name := "ionic"
version := "5.2.1-8070c9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-5c91a1",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-c7c036",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.1-4a2c36",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.1-e8150d",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-154992",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.3-758050",
  "org.scalablytyped" %%% "log-update" % "3.2.0-2826a6",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-a678da",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-4ab268",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "string-width" % "4.1.0-945852",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-2d258f",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-866603")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        