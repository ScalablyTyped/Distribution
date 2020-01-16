organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.11.8-0aa0ef"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.14-0d00bc",
  "org.scalablytyped" %%% "angular__compiler" % "8.2.14-a401a5",
  "org.scalablytyped" %%% "angular__core" % "8.2.14-e0b287",
  "org.scalablytyped" %%% "angular__forms" % "8.2.14-28d187",
  "org.scalablytyped" %%% "angular__router" % "8.2.14-6028bc",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-5f6574",
  "org.scalablytyped" %%% "ionic__core" % "4.11.8-6a621a",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-4f1d78",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-9a5dda",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-50e1f3",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-6209fe",
  "org.scalablytyped" %%% "typescript" % "3.7.4-3655d9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        