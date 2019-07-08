organization := "org.scalablytyped"
name := "inquirer-npm-name"
version := "3.0-dt-20190522Z-ef31d3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-af0acb",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-4ab268",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-d9168c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        