organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "2.1.1-13aa8b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-af0acb",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-154992",
  "org.scalablytyped" %%% "log-update" % "3.2.0-11c734",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-a678da",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-4ab268",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "string-width" % "4.1.0-945852",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-d9168c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        