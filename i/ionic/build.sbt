organization := "org.scalablytyped"
name := "ionic"
version := "5.2.7-542bc8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-4a3558",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-c024d7",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.6-92f6bd",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.4-10c819",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.4-081384",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.7-3db9ea",
  "org.scalablytyped" %%% "log-update" % "3.2.0-655763",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-b40bed",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-fc403d",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "string-width" % "4.1.0-a38b3c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-5fe893",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-5a029c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        